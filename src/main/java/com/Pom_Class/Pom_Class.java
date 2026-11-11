package com.Pom_Class;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class {

	WebDriver driver;

	public Pom_Class(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "//input[@name='email']")
	public WebElement Username;
	@FindBy(xpath = "//input[@name='password']")
	public WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement Login;
	@FindBy(xpath = "//div[text()='Something went wrong']")
	public WebElement InvalidUser;
	@FindBy(xpath = "//p[text()='Email cannot be empty']")
	public WebElement EmptyUser;
	@FindBy(xpath = "//p[text()='Password cannot be empty']")
	public WebElement EmptyPass;
	@FindBy(xpath = "//p[text()='Email cannot be empty']")
	public WebElement Invalid;
	@FindBy(xpath = "//span[text()='Dashboard']")
	public WebElement VDashboard;
	@FindBy(xpath = "(//button[@type='button'])[4]")
	public WebElement FreshLeads;
	@FindBy(xpath = "//td")
	public List<WebElement> LeadData;
	@FindBy(xpath = "//button[text()='FOLLOW-UP(5)']")
	public WebElement Followup;
	@FindBy(xpath = "(//button[@type='button'])[8]")
	public WebElement Callicon;
	@FindBy(xpath = "//h2[@class='text-lg font-bold']")
	public WebElement VSoftphone;
	@FindBy(xpath = "//button[text()='START CALL']")
	public WebElement StartCall;
	@FindBy(xpath = "(//button[@type='button'])[22]")
	public WebElement CancelX;
	@FindBy(xpath = "(//button[@type='button'])[9]")
	public WebElement EditIcon;
	@FindBy(xpath = "//h2[@class='text-xl font-extrabold text-[#0f1e4a]']")
	public WebElement VCUSTOMERINFO;
	@FindBy(xpath = "(//button[@type='button'])[22]")
	public WebElement CancelX1;
	@FindBy(xpath = "//button[text()='INTERESTED(0)']")
	public WebElement Interested;
	@FindBy(xpath = "(//button[@type='button'])[7]")
	public WebElement Closed;
	@FindBy(xpath = "//span[text()='closed']")
	public WebElement VClosed;
	@FindBy(xpath = "//span[text()='Leads']")
	public WebElement Leads;
	@FindBy(xpath = "//span[@class='text-[#3525CD] font-medium']")
	public WebElement VLeads;
	@FindBy(xpath = "//button[text()='Follow-Up']")
	public WebElement LFollowup;
	@FindBy(xpath = "//input[@type='text']")
	public WebElement Filter;
	@FindBy(xpath = "//span[text()='Bavya']")
	public WebElement VBavya;
	@FindBy(xpath = "//button[text()='Interested']")
	public WebElement LInterested;
	@FindBy(xpath = "//button[text()='Closed']")
	public WebElement LClosed;
	@FindBy(xpath = "//span[text()='closed']")
	public WebElement VLClosed;
	@FindBy(xpath = "//span[text()='Follow-Ups']")
	public WebElement FollowupModule;
	@FindBy(xpath = "//h1[text()=' Telemarketing Follow-Up']")
	public WebElement VFollowupModule;
	@FindBy(xpath = "(//div[@class='text-right'])[1]")
	public WebElement VTotalLeadsC;
	@FindBy(xpath = "(//div[@class='text-right'])[2]")
	public WebElement VNewleadC;
	@FindBy(xpath = "(//div[@class='text-right'])[3]")
	public WebElement VInterestedC;
	@FindBy(xpath = "(//div[@class='text-right'])[4]")
	public WebElement VCLosedleadC;
	@FindBy(xpath = "//span[text()='Filter']")
	public WebElement FilterO;
	@FindBy(xpath = "//span[text()='Schedule']")
	public WebElement Schedule;
	@FindBy(xpath = "//h2[text()='Schedule Lead Follow-Up']")
	public WebElement VSchedule;
	@FindBy(xpath = "//button[text()='CANCEL']")
	public WebElement CancelBtn;
	@FindBy(xpath = "//span[text()='Daily Leads']")
	public WebElement DailyLeads;
	@FindBy(xpath = "//h1[text()='Telemarketing Leads']")
	public WebElement VRedirectedDP;
	@FindBy(xpath = "//span[text()='Follow-up']")
	public WebElement Followupp;
	@FindBy(xpath = "(//span[text()='Closed Leads'])[2]")
	public WebElement ClosedLeadss;
	@FindBy(xpath = "(//span[text()='Closed Leads'])[1]")
	public WebElement VRedirectCP;
	@FindBy(xpath = "//span[text()='Reports']")
	public WebElement ReportsModule;
	@FindBy(xpath = "//h1[text()='Telecaller Performance Analytics']")
	public WebElement VReportsModule;
	@FindBy(xpath = "(//div[@class='my-5 flex flex-col gap-2'])[1]")
	public WebElement VTodayP;
	@FindBy(xpath = "(//div[@class='my-5 flex flex-col gap-2'])[2]")
	public WebElement VExcentellentP;
	@FindBy(xpath = "(//div[@class='my-5 flex flex-col gap-2'])[3]")
	public WebElement VGoodP;
	@FindBy(xpath = "((//div[@class='my-5 flex flex-col gap-2'])[4])")
	public WebElement VQualityP;
	@FindBy(xpath = "//div[@class='border-none']")
	public WebElement Vmontlyanalysis;
	@FindBy(xpath = "(//div[@class='flex items-center gap-2 group'])[1]")
	public WebElement Month;
	@FindBy(xpath = "//div[@class='border-none']")
	public WebElement VMonthlychanges;
	@FindBy(xpath = "//button[text()='Next']")
	public WebElement Next;
	@FindBy(xpath = "//div[@class='border-none']")
	public WebElement Vnext;
	@FindBy(xpath = "//button[text()='Prev']")
	public WebElement Previous;
	@FindBy(xpath = "//div[@class='border-none']")
	public WebElement VPrevious;
	@FindBy(xpath = "//span[text()='Closed Leads']")
	public WebElement ClosedLeadM;
	@FindBy(xpath = "//p[text()='Manage your active and closed outreach funnels & recovery campaigns.']")
	public WebElement ValClosedlead;
	@FindBy(xpath = "//p[text()='Not Interested']")
	public WebElement ValNotInter;
	@FindBy(xpath = "//p[text()='Conv. Rate']")
	public WebElement ValConvRate;
	@FindBy(xpath = "//p[text()='Avg. Duration']")
	public WebElement ValAvgDur;
	@FindBy(xpath = "//p[text()='Bounce Rate']")
	public WebElement ValBouncRate;
	@FindBy(xpath = "//button[text()='Active Leads']")
	public WebElement ActiveLeadsOp;
	@FindBy(xpath = "//p[@class='text-sm text-gray-600']")
	public WebElement VActiveLeadsOp;
	@FindBy(xpath = "(//button[@class='hover:text-[#435DAB]'])[2]")
	public WebElement ViewEdit;
	@FindBy(xpath = "//h2[@class='text-xl font-extrabold text-[#0f1e4a]']")
	public WebElement VViewEdit;
	@FindBy(xpath = "//button[text()='CANCEL']")
	public WebElement CancelEdit;
	@FindBy(xpath = "(//div[@class='relative'])[2]")
	public WebElement Filterdays;
	@FindBy(xpath = "//option[text()='Last 30 Days']")
	public WebElement selectO;
	@FindBy(xpath = "//p[@class='text-sm text-gray-600']")
	public WebElement VselectO;
	@FindBy(xpath = "//button[text()='Closed Leads (Not Interested)']")
	public WebElement ClosedLeadsNI;
	@FindBy(xpath = "//p[@class='text-sm text-gray-600']")
	public WebElement VClosedLeadsNI;
	@FindBy(xpath = "//button[text()='Archived']")
	public WebElement Archived;
	@FindBy(xpath = "//p[@class='text-sm text-gray-600']")
	public WebElement VArchived;
	@FindBy(xpath = "//button[text()='Export Report']")
	public WebElement ExportBtn;
	@FindBy(xpath = "//span[text()='Settings']")
	public WebElement Settings;
	@FindBy(xpath = "//h1[text()='System & Dialer Settings']")
	public WebElement VSettings;
	@FindBy(xpath = "//input[@name='reDailyTarget']")
	public WebElement RepTarget;
	@FindBy(xpath = "//input[@name='reDailyTarget']")
	public WebElement VRepTarget;
	@FindBy(xpath = "//input[@name='autoDialDelay']")
	public WebElement Delay;
	@FindBy(xpath = "//input[@name='autoDialDelay']")
	public WebElement VDelay;
	@FindBy(xpath = "//select[@name='callRecording']")
	public WebElement CallRec;
	@FindBy(xpath = "//option[text()='On-Demand']")
	public WebElement OnDemand;
	@FindBy(xpath = "//button[text()='SAVE SETTINGS']")
	public WebElement Savessetting;
	@FindBy(xpath = "//span[text()='Profile']")
	public WebElement Profile;
	@FindBy(xpath = "//label[text()='Full Name']")
	public WebElement VProfile;
	@FindBy(xpath = "//input[@name='name']")
	public WebElement VFullname1;
	@FindBy(xpath = "//button[text()='Edit Profile']")
	public WebElement EditProfile;
	@FindBy(xpath = "//input[@name='name']")
	public WebElement FullName;
	@FindBy(xpath = "//button[text()='Update']")
	public WebElement Update;
	@FindBy(xpath = "//input[@name='name']")
	public WebElement VfullName2;
	@FindBy(xpath = "//input[@type='tel']")
	public WebElement VMobileNumber2;
	@FindBy(xpath = "//input[@name='createdAt']")
	public WebElement VCreatedat;
	@FindBy(xpath = "(//input[@type='email'])[1]")
	public WebElement VEmail;
	@FindBy(xpath = "//input[@name='lastlogin']")
	public WebElement VLastLogin;
	@FindBy(xpath = "//div[text()='1,284']")
	public WebElement VOTotalcals;
	@FindBy(xpath = "//div[text()='64.8%']")
	public WebElement VOSuccessRate;
	@FindBy(xpath = "//div[text()='4m 22s']")
	public WebElement VOAvgDur;
	@FindBy(xpath = "//span[text()='Top Performance']")
	public WebElement VTeamRank;
	@FindBy(xpath = "//button[text()='Change Password']")
	public WebElement ChangePassword;
	@FindBy(xpath = "//h2[text()='Change Password']")
	public WebElement VChangePass;
	@FindBy(xpath = "//input[@name='newPassword']")
	public WebElement NewPass;
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement Submit3;
	@FindBy(xpath = "//button[text()='Cancel']")
	public WebElement Cancel3;
	@FindBy(xpath = "//span[text()='Tickets']")
	public WebElement TicketModule;
	@FindBy(xpath = "//h1[@class='text-3xl font-bold text-black']")
	public WebElement VTicketModule;
	@FindBy(xpath = "//button[text()='Create Ticket']")
	public WebElement CreateTicket;
	@FindBy(xpath = "//h2[text()='Create Support Ticket']")
	public WebElement VCreateTicket;
	@FindBy(xpath = "//select[@name='leadId']")
	public WebElement SelectCust;
	@FindBy(xpath = "//option[text()='Siva Kumar']")
	public WebElement Sivakumar;
	@FindBy(xpath = "//select[@name='assignTo']")
	public WebElement SelectAsigne;
	@FindBy(xpath = "//option[text()='YUVABALAN']")
	public WebElement Yuvabalan;
	@FindBy(xpath = "//input[@name='ticketTitle']")
	public WebElement TicketTitle;
	@FindBy(xpath = "//select[@name='priority']")
	public WebElement selctPriority;
	@FindBy(xpath = "//option[text()='Low']")
	public WebElement Low;
	@FindBy(xpath = "//select[@name='category']")
	public WebElement SelectCategory;
	@FindBy(xpath = "//option[text()='request']")
	public WebElement Request;
	@FindBy(xpath = "//button[text()='SAVE & QUEUE TICKET']")
	public WebElement SAVEQUEUETICKET;
	@FindBy(xpath = "(//div[@class='flex items-start justify-between gap-4'])[1]")
	public WebElement VAddedT;
	@FindBy(xpath = "//select[@name='priority']")
	public WebElement CLow;
	@FindBy(xpath = "//span[text()='Logout']")
	public WebElement LogoutModule;
	@FindBy(xpath = "//h3[text()='Are You Logging Out?']")
	public WebElement Vlogout1;
	@FindBy(xpath = "//button[text()='Close']")
	public WebElement CloseLog;
	@FindBy(xpath = "(//button[@type='button'])[3]")
	public WebElement LogoutIcon;
	@FindBy(xpath = "//h3[text()='Are You Logging Out?']")
	public WebElement Vlogout2;
	@FindBy(xpath = "//button[text()='Close']")
	public WebElement iconclose;
	@FindBy(xpath = "//button[text()='Log Out']")
	public WebElement Logout;

//@FindBy (xpath = "")
//public WebElement ;
//@FindBy (xpath = "")
//public WebElement ;
//@FindBy (xpath = "")
//public WebElement ;
//@FindBy (xpath = "")
//public WebElement ;
//@FindBy (xpath = "")
//public WebElement ;

}
