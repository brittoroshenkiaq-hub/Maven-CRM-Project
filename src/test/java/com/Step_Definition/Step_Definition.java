package com.Step_Definition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Base_Class.Base_Class;
import com.Pom_Class.Pom_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class {
	Pom_Class pom = new Pom_Class(driver);
	public static List<String> Leads = new ArrayList<String>();

	@Given("User Validates the Login Page")
	public void user_validates_the_login_page() {
		Assert.assertTrue(Url().contains("cloudfront"));
	}

	@Given("User enters the Username {string}")
	public void user_enters_the_username(String Username) {
		Sendkeys(pom.Username, Username);

	}

	@Given("User enters the Password {string}")
	public void user_enters_the_password(String Password) {
		Sendkeys(pom.Password, Password);
	}

	@Then("User clicks on the Login Btn")
	public void user_clicks_on_the_login_btn() {
		click(pom.Login);

	}

	@Then("the user validate the redirected page {string}")
	public void the_user_validate_the_redirected_page(String Expected) {
		switch (Expected) {
		case "invalidUser":
			String actual = gettxt(pom.InvalidUser);
			Assert.assertEquals("Something went wrong", actual);
			System.out.println(actual);
			break;

		case "EmptyUser":
			actual = gettxt(pom.EmptyUser);
			Assert.assertEquals("Email cannot be empty", actual);
			System.out.println(actual);
			break;

		case "EmptyPass":

			actual = gettxt(pom.EmptyPass);
			Assert.assertEquals("Password cannot be empty", actual);
			System.out.println(actual);
			break;

		case "invalid":

			actual = gettxt(pom.Invalid);
			Assert.assertEquals("Email cannot be empty", actual);
			System.out.println(actual);
			break;
		}
	}

	@Given("User Validates the Dashborad Module")
	public void user_validates_the_dashborad_module() {
		Assert.assertTrue(gettxt(pom.VDashboard).contains("Dashboard"));
	}

	@When("User Clicks on Fresh Leads")
	public void user_clicks_on_fresh_leads() {
		scrollIntoView(pom.FreshLeads);
		click(pom.FreshLeads);
	}

	@Then("User Validates the Result")
	public void user_validates_the_result() {
		List<WebElement> LeadDataStatus = pom.LeadData;
		for (int i = 0; i < LeadDataStatus.size(); i++) {
			Leads.add(LeadDataStatus.get(i).getText().trim());

		}
		System.out.println(Leads);
		// Assert.assertTrue(Leads.contains("Bavya,"));
	}

	@Then("User clicks on Followup")
	public void user_clicks_on_followup() {
		click(pom.Followup);

	}

	@Then("User clicks on the Call icon")
	public void user_clicks_on_the_call_icon() throws InterruptedException {
		Thread.sleep(3000);
		click(pom.Callicon);

	}

	@Then("User Validates  the Softphone")
	public void user_validates_the_softphone() {
		Assert.assertTrue(gettxt(pom.VSoftphone).contains("Softphone"));

	}

	@Then("User clicks on the Start Call")
	public void user_clicks_on_the_start_call() {
		click(pom.StartCall);

	}

	@Then("User clicks on the X button")
	public void user_clicks_on_the_x_button() {
		click(pom.CancelX);

	}

	@Given("User clicks on the Edit icon")
	public void user_clicks_on_the_edit_icon() {
		click(pom.EditIcon);

	}

	@Then("User validates the Customer Information")
	public void user_validates_the_customer_information() {
		Assert.assertTrue(gettxt(pom.VCUSTOMERINFO).contains("Edit Lead Details"));

	}

	@Then("User clicks on CancelX button")
	public void user_clicks_on_cancel_x_button() {
		click(pom.CancelX);

	}

	@Then("User clicks on Interested")
	public void user_clicks_on_interested() {
		click(pom.Interested);

	}

	@Then("User clicks on Closed")
	public void user_clicks_on_closed() {
		click(pom.Closed);

	}

	@Given("User Clicks on the Leads")
	public void user_clicks_on_the_leads() {
		click(pom.Leads);

	}

	@When("User Validates the Leads mo")
	public void user_validates_the_leads_mo() {
		scrollIntoView(pom.VLeads);
		Assert.assertTrue(pom.VLeads.isDisplayed());

	}

	@When("User clicks on LFollowup")
	public void user_clicks_on_l_followup() {
		click(pom.LFollowup);

	}

	@Then("User enter keyword on Filter {string}")
	public void user_enter_keyword_on_filter(String Filter) {
		Sendkeys(pom.Filter, Filter);

	}

	@Then("User Validates the Result1")
	public void user_validates_the_result1() {
		Assert.assertTrue(gettxt(pom.VBavya).contains("Bavya"));

	}

	@When("user clicks on LInterested")
	public void user_clicks_on_l_interested() {
		click(pom.LInterested);

	}

	@When("User cliks on LClosed")
	public void user_cliks_on_l_closed() {
		scrollIntoView(pom.LClosed);
		click(pom.LClosed);

	}

	@Given("User clicks on Follow-Ups")
	public void user_clicks_on_follow_ups() {
		click(pom.FollowupModule);

	}

	@Then("User validates the Follow-Up page")
	public void user_validates_the_follow_up_page() {
		Assert.assertTrue(gettxt(pom.VFollowupModule).contains("Follow-Up"));

	}

	@Then("User Validates the Total Leads Count")
	public void user_validates_the_total_leads_count() {
		Assert.assertTrue(pom.VTotalLeadsC.isDisplayed());

	}

	@Then("user Validates Fresh Leads Count")
	public void user_validates_fresh_leads_count() {
		Assert.assertTrue(pom.VNewleadC.isDisplayed());

	}

	@Then("User validates the Interested Leads Count")
	public void user_validates_the_interested_leads_count() {
		Assert.assertTrue(gettxt(pom.VInterestedC).contains("0"));

	}

	@Then("User Validates the Closed Leads count")
	public void user_validates_the_closed_leads_count() {
		Assert.assertTrue(gettxt(pom.VCLosedleadC).contains("0"));

	}

	@Then("User clicks on filter option")
	public void user_clicks_on_filter_option() {
		click(pom.FilterO);

	}

	@Then("User clicks on Scedule Option")
	public void user_clicks_on_scedule_option() {
		click(pom.Schedule);

	}

	@Then("Usr Validates the Schedule Lead popup")
	public void usr_validates_the_schedule_lead_popup() {
		Assert.assertTrue(gettxt(pom.VSchedule).contains("Schedule"));

	}

	@Then("User clicks on Cancel Btn")
	public void user_clicks_on_cancel_btn() {
		click(pom.CancelBtn);

	}

	@Then("User clicks on Daily Leads")
	public void user_clicks_on_daily_leads() {
		click(pom.DailyLeads);

	}

	@Then("User Validates the Redirected page")
	public void user_validates_the_redirected_page() {
		Assert.assertTrue(gettxt(pom.VRedirectedDP).contains("Telemarketing Leads"));

	}

	@Then("User clicks on Follow-up")
	public void user_clicks_on_follow_up() {
		back();
		click(pom.Followupp);

	}

	@Then("User Clicks on Closed Leads")
	public void user_clicks_on_closed_leads() {
		click(pom.ClosedLeadss);

	}

	@Then("User clicks on Redirected Closed Leads page")
	public void user_clicks_on_redirected_closed_leads_page() {
		click(pom.VRedirectCP);
		back();

	}

	@Given("User clicks on the Reports Module")
	public void user_clicks_on_the_reports_module() {
		click(pom.ReportsModule);

	}

	@Then("User VAlidate the Reports Module Page")
	public void user_v_alidate_the_reports_module_page() {
		Assert.assertTrue(gettxt(pom.VReportsModule).contains("Analytics"));

	}

	@Then("User validates Total calls card")
	public void user_validates_total_calls_card() {
		Assert.assertTrue(gettxt(pom.VTodayP).contains("7"));

	}

	@Then("User Validates the Conversion Rate card")
	public void user_validates_the_conversion_rate_card() {
		Assert.assertTrue(gettxt(pom.VExcentellentP).contains("0.0%"));

	}

	@Then("User Validates the Success Rate card")
	public void user_validates_the_success_rate_card() {
		Assert.assertTrue(pom.VGoodP.isDisplayed());

	}

	@Then("User Validates the Avg Duration card")
	public void user_validates_the_avg_duration_card() {
		Assert.assertTrue(pom.VQualityP.isDisplayed());
	}

	@Then("User Validates the Detailed montly analysis")
	public void user_validates_the_detailed_montly_analysis() {
		Assert.assertTrue(gettxt(pom.Vmontlyanalysis).contains("January"));

	}

	@Then("User clicks on month")
	public void user_clicks_on_month() {
		scrollIntoView(pom.Month);
		click(pom.Month);

	}

	@Then("User validates the Detailed monthly analysis changes")
	public void user_validates_the_detailed_monthly_analysis_changes() {
		Assert.assertTrue(gettxt(pom.VMonthlychanges).contains("April"));

	}

	@Then("User clicks on next btn")
	public void user_clicks_on_next_btn() {
		click(pom.Next);

	}

	@Then("User valiadtes the next page analysis")
	public void user_valiadtes_the_next_page_analysis() {
		Assert.assertTrue(gettxt(pom.Vnext).contains("August"));

	}

	@Then("User clicks on Prev")
	public void user_clicks_on_prev() {
		click(pom.Previous);

	}

	@Then("User Validates the Prev analysis page")
	public void user_validates_the_prev_analysis_page() {
		Assert.assertTrue(gettxt(pom.VPrevious).contains("April"));

	}

	@Given("User Clicks on the Ticket Module")
	public void user_clicks_on_the_ticket_module() {
		click(pom.TicketModule);

	}

	@Then("User Validates the Ticket Module")
	public void user_validates_the_ticket_module() {
		scrollIntoView(pom.VTicketModule);
		wait.until(ExpectedConditions.visibilityOf(pom.VTicketModule));
		Assert.assertTrue(pom.VTicketModule.isDisplayed());

	}

	@Then("User clicks on Create Ticket Option")
	public void user_clicks_on_create_ticket_option() {
		click(pom.CreateTicket);

	}

	@Then("User Validates the Create Ticket Option")
	public void user_validates_the_create_ticket_option() {
		Assert.assertTrue(pom.VCreateTicket.isDisplayed());

	}

	@Then("User clicks on select customer")
	public void user_clicks_on_select_customer() {
		CustomName(pom.SelectCust, "Siva Kumar");

	}

	@Then("User clicks on select Assignee")
	public void user_clicks_on_select_assignee() {
		Assignee(pom.SelectAsigne, "YUVABALAN");

	}

	@Then("User enters the Ticket Title {string}")
	public void user_enters_the_ticket_title(String Title) {
		Sendkeys(pom.TicketTitle, Title);

	}

	@Then("User clicks on select Priority")
	public void user_clicks_on_select_priority() {
		Priority(pom.selctPriority, "Low");

	}

	@Then("User clicks on select Category")
	public void user_clicks_on_select_category() {
		Category(pom.SelectCategory, "request");
	}

	@Then("user clicks on Save & Queue Ticket")
	public void user_clicks_on_save_queue_ticket() {
		click(pom.SAVEQUEUETICKET);

	}

	@Then("User Validates the Added Ticket")
	public void user_validates_the_added_ticket() {
		Assert.assertTrue(pom.VAddedT.isDisplayed());

	}

	@Given("User clicks on Closed Leads Module")
	public void user_clicks_on_closed_leads_module() {
		click(pom.ClosedLeadM);

	}

	@Then("User Validates the Closed leads Module Page")
	public void user_validates_the_closed_leads_module_page() {
		Assert.assertTrue(gettxt(pom.ValClosedlead).contains("closed outreach"));

	}

	@Then("User validates the Not interested card")
	public void user_validates_the_not_interested_card() {
		Assert.assertTrue(pom.ValNotInter.isDisplayed());

	}

	@Then("User validates the Conv. Rate card")
	public void user_validates_the_conv_rate_card() {
		Assert.assertTrue(pom.ValNotInter.isDisplayed());
	}

	@Then("User validates the Avg. Duration Card leads")
	public void user_validates_the_avg_duration_card_leads() {
		Assert.assertTrue(pom.ValConvRate.isDisplayed());
	}

	@Then("User validates the Bounce Rate Card")
	public void user_validates_the_bounce_rate_card() {
		Assert.assertTrue(pom.ValBouncRate.isDisplayed());
	}

	@Then("user clicks on Active Leads")
	public void user_clicks_on_active_leads() {
		click(pom.ActiveLeadsOp);

	}

	@Then("User Validates the Active Leads page")
	public void user_validates_the_active_leads_page() {
		Assert.assertTrue(pom.VActiveLeadsOp.isDisplayed());
	}

	@Then("User clicks on Edit leads Option")
	public void user_clicks_on_edit_leads_option() {
		click(pom.ViewEdit);
	}

	@Then("User Validates the Edit Lead Details")
	public void user_validates_the_edit_lead_details() {
		Assert.assertTrue(pom.VViewEdit.isDisplayed());
	}

	@Then("User Clicks on Cancel in Edit Leads Page")
	public void user_clicks_on_cancel_in_edit_leads_page() {
		click(pom.CancelEdit);
	}

	@Then("User clicks on Filter Days")
	public void user_clicks_on_filter_days() {
		click(pom.Filterdays);
	}

	@Then("User Selects days option")
	public void user_selects_days_option() {
		click(pom.selectO);

	}

	@Then("User Validates the Filtered Page")
	public void user_validates_the_filtered_page() {
		Assert.assertTrue(pom.VselectO.isDisplayed());
	}

	@Then("User clicks on Closed Leads \\(NI)")
	public void user_clicks_on_closed_leads_ni() {
		click(pom.ClosedLeadsNI);
	}

	@Then("User Validates the Closed Leads \\(NI) Page")
	public void user_validates_the_closed_leads_ni_page() {
		Assert.assertTrue(pom.VClosedLeadsNI.isDisplayed());
	}

	@Then("User clicks on Archived Page")
	public void user_clicks_on_archived_page() {
		click(pom.Archived);
	}

	@Then("User Validates the Archived Page")
	public void user_validates_the_archived_page() {
		Assert.assertTrue(pom.VArchived.isDisplayed());
	}

	@Then("User Clicks on Export Report")
	public void user_clicks_on_export_report() {
		click(pom.ExportBtn);
	}

	@Given("User Clicks on Settings Module")
	public void user_clicks_on_settings_module() {
		click(pom.Settings);

	}

	@Then("User validates the Settings Module")
	public void user_validates_the_settings_module() {
		Assert.assertTrue(pom.VSettings.isDisplayed());

	}

	@Then("User Enters REP DAILY TARGET {string}")
	public void user_enters_rep_daily_target(String RepTarget) {
		Sendkeys(pom.RepTarget, RepTarget);

	}

	@Then("User Validates the REP DAILY TARGET")
	public void user_validates_the_rep_daily_target() {
		Assert.assertTrue(pom.VRepTarget.isDisplayed());

	}

	@Then("User Enters AUTO-DIAL DELAY\\(SEC) {string}")
	public void user_enters_auto_dial_delay_sec(String Delay) {
		Sendkeys(pom.Delay, Delay);
	}

	@Then("User Validates the AUTO-DIAL DELAY\\(SEC)")
	public void user_validates_the_auto_dial_delay_sec() {
		Assert.assertTrue(pom.VDelay.isDisplayed());

	}

	@Then("User clicks on CALL RECORDING")
	public void user_clicks_on_call_recording() {
		OnDemand(pom.CallRec, "On-Demand");

	}

	@Then("User clicks on Save Settings")
	public void user_clicks_on_save_settings() {
		click(pom.Savessetting);

	}

	@Given("User clicks on Profile Module")
	public void user_clicks_on_profile_module() {
		click(pom.Profile);

	}

//	@Then("User Validates the Profile Module")
//	public void user_validates_the_profile_module() {
//		Assert.assertTrue(pom.VProfile.isDisplayed());
//
//	}
//
//	@Then("User Validates the First name")
//	public void user_validates_the_first_name() {
//		scrollIntoView(pom.VFullname1);
//		Assert.assertTrue(pom.VFullname1.isDisplayed());
//
//	}

	@Then("User clicks on Edit Profile")
	public void user_clicks_on_edit_profile() {
		scrollIntoView(pom.EditProfile);
		click(pom.EditProfile);

	}

	@Then("User enters the Full Name {string}")
	public void user_enters_the_full_name(String FullName) {
		Sendkeys(pom.FullName, FullName);

	}

	@Then("User clicks on Update")
	public void user_clicks_on_update() {
		click(pom.Update);

	}

	@Then("User validates the Full Name")
	public void user_validates_the_full_name() {
		Assert.assertTrue(pom.VfullName2.isDisplayed());

	}

	@Then("User validates the Mobile Number")
	public void user_validates_the_mobile_number() {
		Assert.assertTrue(pom.VMobileNumber2.isDisplayed());

	}

	@Then("User validates the Account Created")
	public void user_validates_the_account_created() {
		Assert.assertTrue(pom.VCreatedat.isDisplayed());

	}

	@Then("User Validates the Email Address")
	public void user_validates_the_email_address() {
		Assert.assertTrue(pom.VEmail.isDisplayed());

	}

	@Then("user Validates the Last Login")
	public void user_validates_the_last_login() {
		Assert.assertTrue(pom.VLastLogin.isDisplayed());

	}

	@Then("user Validates OTOTAL CALLS")
	public void user_validates_ototal_calls() {
		Assert.assertTrue(pom.VOTotalcals.isDisplayed());

	}

	@Then("User valiadtes the OSUCCESS RATE")
	public void user_valiadtes_the_osuccess_rate() {
		Assert.assertTrue(pom.VOSuccessRate.isDisplayed());

	}

	@Then("User valiadtes the OAVG DURATION")
	public void user_valiadtes_the_oavg_duration() {
		Assert.assertTrue(pom.VOAvgDur.isDisplayed());

	}

	@Then("User valiadtes the TEAM RANK")
	public void user_valiadtes_the_team_rank() {
		Assert.assertTrue(pom.VTeamRank.isDisplayed());

	}

	@Then("User clicks on Change Password")
	public void user_clicks_on_change_password() {
		click(pom.ChangePassword);

	}

	@Then("User valiadtes the Change Password")
	public void user_valiadtes_the_change_password() {
		Assert.assertTrue(pom.VChangePass.isDisplayed());

	}

	@Then("User enter the New Password {string}")
	public void user_enter_the_new_password(String NewPassword) {
		Sendkeys(pom.NewPass, NewPassword);
	}

	@Then("User Clicks on Submit")
	public void user_clicks_on_submit() {
		click(pom.Submit3);

	}

	@Then("User clicks on Cancel")
	public void user_clicks_on_cancel() {
		click(pom.Cancel3);

	}

	@Given("User clicks on the Logout Module")
	public void user_clicks_on_the_logout_module() {
		click(pom.LogoutModule);

	}

	@Then("User Validates the Logout Option")
	public void user_validates_the_logout_option() {
		Assert.assertTrue(pom.Vlogout1.isDisplayed());

	}

	@Then("User clicks on CancelBtnn")
	public void user_clicks_on_cancel_btnn() {
		click(pom.CloseLog);

	}

	@Then("User clicks on Logout Icon")
	public void user_clicks_on_logout_icon() {
		click(pom.LogoutIcon);

	}

	@Then("user validates the Logout btn")
	public void user_validates_the_logout_btn() {
		Assert.assertTrue(pom.Vlogout2.isDisplayed());

	}

	@Then("User clicks on Log out buttonf")
	public void user_clicks_on_log_out_buttonf() {
		click(pom.Logout);

	}

}
