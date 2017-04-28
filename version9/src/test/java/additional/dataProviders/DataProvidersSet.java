package additional.dataProviders;

import org.testng.annotations.DataProvider;
import utility.PropertyLoader;
import utility.PropertySource;

/**
 * Created by Julia on 19.04.2017.
 */
public class DataProvidersSet {

    @DataProvider(name = "wows1")
    public static Object[][] getWow() {
        return new Object[][]{/*{PropertyLoader.loadProperty("animValueDisabled"),PropertyLoader.loadProperty("animValueDisabled2")},*/
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueBounceIn"),PropertyLoader.loadProperty(PropertySource.CSS,"animClassBounceIn2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueBounceInDown"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassBounceInDown2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueBounceInLeft"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassBounceInLeft2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueBounceInRight"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassBounceInRight2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeIn"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeIn2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeInDown"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeInDown2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeInDownBig"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeInDownBig2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeInLeft"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeInLeft2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeInLeftBig"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeInLeftBig2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeInRight"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeInRight2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeInRightBig"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeInRightBig2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeInUp"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeInUp2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeInUpBig"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeInUpBig2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFlipInX"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFlipInX2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFlipInY"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFlipInY2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueLightSpeedIn"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassLightSpeedIn2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueRotateIn"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassRotateIn2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueRotateInDownLeft"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassRotateInDownLeft2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueRotateInDownRight"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassRotateInDownRight2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueRotateInUpLeft"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassRotateInUpLeft2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueRotateInUpRight"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassRotateInUpRight2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueRollIn"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassRollIn2")}};
    }

    @DataProvider(name = "wows2")
    public static Object[][] getWow2() {
        return new Object[][]{{PropertyLoader.loadProperty(PropertySource.VALUES,"animValueDisabled"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassDisabled")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueBounceIn"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassBounceIn")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueBounceInDown"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassBounceInDown")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueBounceInLeft"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassBounceInLeft")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueBounceInRight"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassBounceInRight")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeIn"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeIn")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeInDown"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeInDown")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeInDownBig"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeInDownBig")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeInLeft"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeInLeft")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeInLeftBig"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeInLeftBig")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeInRight"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeInRight")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeInRightBig"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeInRightBig")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeInUp"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeInUp")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFadeInUpBig"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFadeInUpBig")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFlipInX"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFlipInX")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueFlipInY"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassFlipInY")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueLightSpeedIn"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassLightSpeedIn")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueRotateIn"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassRotateIn")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueRotateInDownLeft"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassRotateInDownLeft")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueRotateInDownRight"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassRotateInDownRight")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueRotateInUpLeft"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassRotateInUpLeft")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueRotateInUpRight"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassRotateInUpRight")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"animValueRollIn"), PropertyLoader.loadProperty(PropertySource.CSS,"animClassRollIn")}};
    }

    @DataProvider(name = "colors")
    public static Object[][] getColor() {
        return new Object[][]{{PropertyLoader.loadProperty(PropertySource.VALUES,"colorVarValueDefault"), PropertyLoader.loadProperty(PropertySource.CSS,"colorClassDefault")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"colorVarValuePrimary"), PropertyLoader.loadProperty(PropertySource.CSS,"colorClassPrimary")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"colorVarValueSuccess"), PropertyLoader.loadProperty(PropertySource.CSS,"colorClassSuccess")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"colorVarValueDanger"), PropertyLoader.loadProperty(PropertySource.CSS,"colorClassDanger")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"colorVarValueWarnint"), PropertyLoader.loadProperty(PropertySource.CSS,"colorClassWarningt")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"colorVarValueInfo"), PropertyLoader.loadProperty(PropertySource.CSS,"colorClassInfo")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"colorVarValueFlat"), PropertyLoader.loadProperty(PropertySource.CSS,"colorClassFlat")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"colorVarValueTransparent"), PropertyLoader.loadProperty(PropertySource.CSS,"colorClassTransparent")}};
    }

    @DataProvider(name = "text")
    public static Object[][] setText() {
        return new Object[][]{{PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"text1")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"text20")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"text50")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"textAll")}};
    }

    @DataProvider(name = "fName")
    public static Object[][] getName() {
        return new Object[][]{{PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"text1")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"text20")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"textAll")}};
    }

    /*1st element - phone input mask (diff variants), 2nd element - phone number in form and lead details*/
    @DataProvider(name = "phones")
    public static Object[][] getPhone() {
        return new Object[][]{{PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskL1"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneL1")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskL2"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneL2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskN1"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneN1")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskN2"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneN2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskS1"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneS1")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskS2"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneS2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskNLS1"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneNLS1")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskNLS2"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneNLS2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskLSN1"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneLSN1")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskLSN2"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneLSN2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskMix1"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneMix1")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskMix2"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneMix2")}};
    }

    @DataProvider(name = "incorrectPhones")
    public static Object[][] getIncorrectPhone() {
        return new Object[][]{{PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskL1"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneMix1")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskL2"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneLSN2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskN1"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneL2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskN2"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneS2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskNLS1"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneS1")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskNLS2"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneLSN1")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskLSN1"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneNLS2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskLSN2"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneL2")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskMix1"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneL1")},
                {PropertyLoader.loadProperty(PropertySource.VALUES,"inputMaskMix2"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"phoneN1")}};
    }

    @DataProvider(name = "incorrectEmail")
    public static Object[][] getIncorrectEmail() {
        return new Object[][]{{PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail1")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail2")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail3")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail4")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail5")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail6")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail7")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail8")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail9")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail10")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail11")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail12")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail13")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail14")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail15")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail16")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail17")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail18")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail19")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail20")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail21")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail22")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail23")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nEmail24")},};
    }

    @DataProvider(name = "intPhones")
    public static Object[][] getIntPhone() {
        return new Object[][]{{PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"intPhone0"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"intPhone0")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"intPhone1"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"intPhone1")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"intPhone10"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"intPhone10")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"intPhone20"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"intPhone20")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"intPhone21"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"intPhone20")}};
    }

    @DataProvider(name = "comments")
    private static Object[][] putComments() {
        return new Object[][]{{PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"comment1"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"comment1")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"comment1000"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"comment1000")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"comment2000"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"comment2000")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"comment2001"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"comment2000")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"commentTag"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"comment1")}};
    }

    @DataProvider(name = "commentsCount")
    private static Object[][] putCommentsCount() {
        return new Object[][]{{PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"comment1"), PropertyLoader.loadProperty(PropertySource.VALUES,"count1999")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"comment1000"), PropertyLoader.loadProperty(PropertySource.VALUES,"count1000")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"comment2000"), PropertyLoader.loadProperty(PropertySource.VALUES,"count0")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"comment2001"), PropertyLoader.loadProperty(PropertySource.VALUES,"count0")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"commentTag"), PropertyLoader.loadProperty(PropertySource.VALUES,"count1999")}};
    }

    @DataProvider(name = "correctVin")
    public static Object[][] putVin() {
        return new Object[][]{{PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin0"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin0")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin17"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin17")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin18"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin17")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vinNum"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vinNum")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vinLet"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vinLet")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vinMix"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vinMix")}};
    }

    @DataProvider(name = "incorrectVin")
    public static Object[][] putIncorrectVin() {
        return new Object[][]{{PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin1")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin2")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin3")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin4")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin5")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin6")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin7")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin8")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin9")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin10")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin11")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin12")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin13")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin14")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin15")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vin16")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"vinRus")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin1")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin2")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin3")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin4")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin5")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin6")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin7")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin8")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin9")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin10")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin11")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin12")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin13")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin14")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin15")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin16")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin17")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin18")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin19")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin20")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin21")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin22")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin23")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin24")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin25")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin26")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin27")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin28")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin29")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"nVin30")}};
    }

    @DataProvider(name = "years")
    public static Object[][] getYear() {
        return new Object[][]{{"Select Year"},{"2018"},{"2017"},{"2016"},{"2015"},{"2014"},{"2013"},{"2012"},{"2011"},{"2010"},{"2009"},
                 {"2008"},{"2007"},{"2006"},{"2005"},{"2004"},{"2003"},{"2002"},{"2001"},{"2000"},{"1999"},{"1998"},{"1997"},
                 {"1996"},{"1995"},{"1994"},{"1993"},{"1992"},{"1991"},{"1990"},{"1989"},{"1988"},{"1987"},{"1986"},{"1985"},
                 {"1984"},{"1983"},{"1982"},{"1980"},{"1979"},{"1978"},{"1977"},{"1976"},{"1975"},{"1974"},{"1973"},{"1972"},
                 {"1970"},{"1969"},{"1968"},{"1967"},{"1965"},{"1964"},{"1963"},{"1962"},{"1961"},{"1960"},{"1959"},{"1958"},
                 {"1957"},{"1956"},{"1955"},{"1954"},{"1953"},{"1952"},{"1951"},{"1950"},{"1949"},{"1948"},{"1947"},{"1946"},
                 {"1945"},{"1944"},{"1943"},{"1942"},{"1941"},{"1940"},{"1939"},{"1938"},{"1937"},{"1936"},{"1935"},{"1934"},
                 {"1933"},{"1932"},{"1931"},{"1930"},{"1929"},{"1928"},{"1927"},{"1926"},{"1925"},{"192"},{"1923"},{"1922"},
                 {"1921"},{"1920"},{"1919"},{"1918"},{"1917"},{"1916"},{"1915"},{"1914"},{"1913"},{"1912"},{"1911"},{"1910"},
                 {"1909"},{"1908"},{"1907"},{"1906"},{"1905"},{"1904"},{"1903"},{"1902"},{"1901"}
        };
    }

    @DataProvider(name = "yearsLead")
    public static Object[][] getYearLead() {
        return new Object[][]{{"Select Year", ""},{"2018", "2018"},{"2017", "2017"},{"2016", "2016"},{"2015", "2015"},
                {"2014", "2014"},{"2013", "2013"},{"2012", "2012"},{"2011", "2011"},{"2010", "2010"},
                {"2009", "2009"},{"2008", "2008"},{"2007", "2007"},{"2006", "2006"},{"2005", "2005"},
                {"2004", "2004"},{"2003", "2003"},{"2002", "2002"},{"2001", "2001"},{"2000", "2000"},
                {"1999", "1999"},{"1998", "1998"},{"1997", "1997"},{"1996", "1996"},{"1995", "1995"},
                {"1994", "1994"},{"1993", "1993"},{"1992", "1992"},{"1991", "1991"},{"1990", "1990"},
                {"1989", "1989"},{"1988", "1988"},{"1987", "1987"},{"1986", "1986"},{"1985", "1985"},
                {"1984", "1984"}, {"1983", "1983"}, {"1982", "1982"}, {"1981", "1981"}, {"1980", "1980"},
                {"1979", "1979"}, {"1978", "1978"}, {"1977", "1977"}, {"1976", "1976"}, {"1975", "1975"},
                {"1974", "1974"}, {"1973", "1973"}, {"1972", "1972"}, {"1971", "1971"}, {"1970", "1970"},
                {"1969", "1969"}, {"1968", "1968"}, {"1967", "1967"}, {"1966", "1966"}, {"1965", "1965"},
                {"1964", "1964"}, {"1963", "1963"}, {"1962", "1962"}, {"1961", "1961"}, {"1960", "1960"},
                {"1959", "1959"}, {"1958", "1958"}, {"1957", "1957"}, {"1956", "1956"}, {"1955", "1955"},
                {"1954", "1954"}, {"1953", "1953"}, {"1952", "1952"}, {"1951", "1951"}, {"1950", "1950"},
                {"1949", "1949"}, {"1948", "1948"}, {"1947", "1947"}, {"1946", "1946"}, {"1945", "1945"},
                {"1944", "1944"}, {"1943", "1943"}, {"1942", "1942"}, {"1941", "1941"}, {"1940", "1940"},
                {"1939", "1939"}, {"1938", "1938"}, {"1937", "1937"}, {"1936", "1936"}, {"1935", "1935"},
                {"1934", "1934"}, {"1933", "1933"}, {"1932", "1932"}, {"1931", "1931"}, {"1930", "1930"},
                {"1929", "1929"}, {"1928", "1928"}, {"1927", "1927"}, {"1926", "1926"}, {"1925", "1925"},
                {"1924", "1924"}, {"1923", "1923"}, {"1922", "1922"}, {"1921", "1921"}, {"1920", "1920"},
                {"1919", "1919"}, {"1918", "1918"}, {"1917", "1917"}, {"1916", "1916"}, {"1915", "1915"},
                {"1914", "1914"}, {"1913", "1913"}, {"1912", "1912"}, {"1911", "1911"}, {"1910", "1910"},
                {"1909", "1909"}, {"1908", "1908"}, {"1907", "1907"}, {"1906", "1906"}, {"1905", "1905"},
                {"1904", "1904"}, {"1903", "1903"}, {"1902", "1902"}, {"1901", "1901"}};
    }

    @DataProvider(name = "incorrectPrice")
    public static Object[][] getIncorrectPrice() {
        return new Object[][]{{PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char1")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char2")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char3")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char4")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char5")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char6")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char7")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char8")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char9")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char10")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char11")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char12")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char13")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char14")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char15")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char16")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char17")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char18")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char19")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char20")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char21")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char22")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char23")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char24")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char25")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char26")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char27")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char28")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char29")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"char30")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let1")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let2")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let3")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let4")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let5")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let6")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let7")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let8")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let9")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let10")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let11")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let12")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let13")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let14")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let15")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let16")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let17")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let18")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let19")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let20")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let21")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let22")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let23")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let24")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let25")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"let26")}};
    }

    @DataProvider(name = "correctPrice")
    public static Object[][] getCorrectPrice() {
        return new Object[][]{{PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"number0"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"number00")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"number1"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"number1")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"number10"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"number10L")}};
    }

    @DataProvider(name = "correctOdometer")
    public static Object[][] getCorrectOdometer() {
        return new Object[][]{{PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"number0"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"number00")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"number1"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"number1")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"number10"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"number10L")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"number11"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"number10L")}};
    }

    @DataProvider(name = "motorizedType")
    public static Object[][] getMotorizedType() {
        return new Object[][]{{"Select Motorized Type", ""},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"AGRICULTURAL_EQUIPMENT"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"AGRICULTURAL_EQUIPMENT")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"AIRCRAFT"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"AIRCRAFT")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"ATVs"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"ATVs")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"BOAT"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"BOAT")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"CARS_TRUCKS_VANS"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"CARS_TRUCKS_VANS")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"COMMERCIAL_TRUCKS"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"COMMERCIAL_TRUCKS")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"CONSTRUCTION_EQUIPMENT"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"CONSTRUCTION_EQUIPMENT")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"DISMANTLED_MACHINE"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"DISMANTLED_MACHINE")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"GO_KARTS_COOTERS"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"GO_KARTS_COOTERS")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"LIGHT_TRUCK"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"LIGHT_TRUCK")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"MILITARY_VEHICLES"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"MILITARY_VEHICLES")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"MOTORCYCLE"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"MOTORCYCLE")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"OTHER"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"OTHER")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"PWC/ATV"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"PWC/ATV")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"RVs_CAMPERS"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"RVs_CAMPERS")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"SAVING_PLANS_(CARS)"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"SAVING_PLANS_(CARS)")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"SNOWMOBILES"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"SNOWMOBILES")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"TRAILERS"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"TRAILERS")},
        };
    }

    @DataProvider(name = "motorizedTypeWithoutSelect")
    public static Object[][] getMotorizedType2() {
        return new Object[][]{{PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"AGRICULTURAL_EQUIPMENT"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"AGRICULTURAL_EQUIPMENT")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"AIRCRAFT"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"AIRCRAFT")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"ATVs"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"ATVs")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"BOAT"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"BOAT")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"CARS_TRUCKS_VANS"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"CARS_TRUCKS_VANS")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"COMMERCIAL_TRUCKS"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"COMMERCIAL_TRUCKS")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"CONSTRUCTION_EQUIPMENT"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"CONSTRUCTION_EQUIPMENT")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"DISMANTLED_MACHINE"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"DISMANTLED_MACHINE")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"GO_KARTS_COOTERS"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"GO_KARTS_COOTERS")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"LIGHT_TRUCK"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"LIGHT_TRUCK")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"MILITARY_VEHICLES"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"MILITARY_VEHICLES")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"MOTORCYCLE"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"MOTORCYCLE")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"OTHER"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"OTHER")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"PWC/ATV"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"PWC/ATV")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"RVs_CAMPERS"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"RVs_CAMPERS")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"SAVING_PLANS_(CARS)"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"SAVING_PLANS_(CARS)")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"SNOWMOBILES"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"SNOWMOBILES")},
                {PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"TRAILERS"), PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"TRAILERS")},
        };
    }
}
