package org.apache.commons.math.complex;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Double;

public class ComplexFormat_formatDouble_157314220737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1121;
     Object term1322;
     Object term1324;
     Object term1356;

    public ComplexFormat_formatDouble_157314220737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13903 = Class.forName((String) "java.math.RoundingMode");
        Field term13902 = ((Class) term13903).getDeclaredField((String) "UNNECESSARY");
        ((Field) term13902).setAccessible(true);
        Object enum22 = ((Field) term13902).get((Object) null);
        term1121 = newInstance(Class.forName("org.apache.commons.math.complex.ComplexFormat"));
        Object term1125 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term1126 = newInstance(Class.forName("java.text.DigitList"));
        char[] term1129 = (char[]) newCharArray(19);
        Object term1178 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        Object term1201 = newInstance(Class.forName("java.util.Locale"));
        Object term1202 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1228 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term1229 = newInstance(Class.forName("java.text.DigitList"));
        char[] term1232 = (char[]) newCharArray(19);
        Object term1277 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        setField(term1121, term1121.getClass(), "imaginaryCharacter", "i");
        setField(term1125, term1125.getClass(), "bigIntegerMultiplier", null);
        setField(term1125, term1125.getClass(), "bigDecimalMultiplier", null);
        setIntField(term1126, term1126.getClass(), "decimalAt", 0);
        setIntField(term1126, term1126.getClass(), "count", 0);
        setField(term1126, term1126.getClass(), "digits", term1129);
        setField(term1126, term1126.getClass(), "data", null);
        setField(term1126, term1126.getClass(), "roundingMode", enum22);
        setBooleanField(term1126, term1126.getClass(), "isNegative", false);
        setField(term1126, term1126.getClass(), "tempBuffer", null);
        setField(term1125, term1125.getClass(), "digitList", term1126);
        setField(term1125, term1125.getClass(), "positivePrefix", "");
        setField(term1125, term1125.getClass(), "positiveSuffix", "");
        setField(term1125, term1125.getClass(), "negativePrefix", "-");
        setField(term1125, term1125.getClass(), "negativeSuffix", "");
        setField(term1125, term1125.getClass(), "posPrefixPattern", "");
        setField(term1125, term1125.getClass(), "posSuffixPattern", "");
        setField(term1125, term1125.getClass(), "negPrefixPattern", "\'-");
        setField(term1125, term1125.getClass(), "negSuffixPattern", "");
        setIntField(term1125, term1125.getClass(), "multiplier", 1);
        setByteField(term1125, term1125.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term1125, term1125.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term1125, term1125.getClass(), "parseBigDecimal", false);
        setBooleanField(term1125, term1125.getClass(), "isCurrencyFormat", false);
        setCharField(term1178, term1178.getClass(), "zeroDigit", (char) 48);
        setCharField(term1178, term1178.getClass(), "groupingSeparator", (char) 44);
        setCharField(term1178, term1178.getClass(), "decimalSeparator", (char) 46);
        setCharField(term1178, term1178.getClass(), "perMill", (char) 8240);
        setCharField(term1178, term1178.getClass(), "percent", (char) 37);
        setCharField(term1178, term1178.getClass(), "digit", (char) 35);
        setCharField(term1178, term1178.getClass(), "patternSeparator", (char) 59);
        setField(term1178, term1178.getClass(), "infinity", "\u001E\"");
        setField(term1178, term1178.getClass(), "NaN", "NaN");
        setCharField(term1178, term1178.getClass(), "minusSign", (char) 45);
        setField(term1178, term1178.getClass(), "currencySymbol", null);
        setField(term1178, term1178.getClass(), "intlCurrencySymbol", null);
        setCharField(term1178, term1178.getClass(), "monetarySeparator", (char) 46);
        setCharField(term1178, term1178.getClass(), "exponential", 'E');
        setField(term1178, term1178.getClass(), "exponentialSeparator", "E");
        setField(term1202, term1202.getClass(), "language", null);
        setField(term1202, term1202.getClass(), "script", null);
        setField(term1202, term1202.getClass(), "region", null);
        setField(term1202, term1202.getClass(), "variant", null);
        setIntField(term1202, term1202.getClass(), "hash", 96636889);
        setField(term1201, term1201.getClass(), "baseLocale", term1202);
        setField(term1201, term1201.getClass(), "localeExtensions", null);
        setIntField(term1201, term1201.getClass(), "hashCodeValue", 96636889);
        setField(term1201, term1201.getClass(), "languageTag", "");
        setField(term1178, term1178.getClass(), "locale", term1201);
        setField(term1178, term1178.getClass(), "currency", null);
        setBooleanField(term1178, term1178.getClass(), "currencyInitialized", false);
        setIntField(term1178, term1178.getClass(), "serialVersionOnStream", 3);
        setField(term1125, term1125.getClass(), "symbols", term1178);
        setBooleanField(term1125, term1125.getClass(), "useExponentialNotation", false);
        setField(term1125, term1125.getClass(), "positivePrefixFieldPositions", null);
        setField(term1125, term1125.getClass(), "positiveSuffixFieldPositions", null);
        setField(term1125, term1125.getClass(), "negativePrefixFieldPositions", null);
        setField(term1125, term1125.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term1125, term1125.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term1125, term1125.getClass(), "maximumIntegerDigits", 309);
        setIntField(term1125, term1125.getClass(), "minimumIntegerDigits", 1);
        setIntField(term1125, term1125.getClass(), "maximumFractionDigits", 2);
        setIntField(term1125, term1125.getClass(), "minimumFractionDigits", 0);
        setField(term1125, term1125.getClass(), "roundingMode", enum22);
        setBooleanField(term1125, term1125.getClass(), "isFastPath", false);
        setBooleanField(term1125, term1125.getClass(), "fastPathCheckNeeded", true);
        setField(term1125, term1125.getClass(), "fastPathData", null);
        setIntField(term1125, term1125.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term1125, term1125.getClass(), "groupingUsed", true);
        setByteField(term1125, term1125.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term1125, term1125.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term1125, term1125.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term1125, term1125.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term1125, term1125.getClass(), "parseIntegerOnly", false);
        setField(term1121, term1121.getClass(), "imaginaryFormat", term1125);
        setField(term1228, term1228.getClass(), "bigIntegerMultiplier", null);
        setField(term1228, term1228.getClass(), "bigDecimalMultiplier", null);
        setIntField(term1229, term1229.getClass(), "decimalAt", 0);
        setIntField(term1229, term1229.getClass(), "count", 0);
        setField(term1229, term1229.getClass(), "digits", term1232);
        setField(term1229, term1229.getClass(), "data", null);
        setField(term1229, term1229.getClass(), "roundingMode", enum22);
        setBooleanField(term1229, term1229.getClass(), "isNegative", false);
        setField(term1229, term1229.getClass(), "tempBuffer", null);
        setField(term1228, term1228.getClass(), "digitList", term1229);
        setField(term1228, term1228.getClass(), "positivePrefix", "");
        setField(term1228, term1228.getClass(), "positiveSuffix", "");
        setField(term1228, term1228.getClass(), "negativePrefix", "-");
        setField(term1228, term1228.getClass(), "negativeSuffix", "");
        setField(term1228, term1228.getClass(), "posPrefixPattern", "");
        setField(term1228, term1228.getClass(), "posSuffixPattern", "");
        setField(term1228, term1228.getClass(), "negPrefixPattern", "\'-");
        setField(term1228, term1228.getClass(), "negSuffixPattern", "");
        setIntField(term1228, term1228.getClass(), "multiplier", 1);
        setByteField(term1228, term1228.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term1228, term1228.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term1228, term1228.getClass(), "parseBigDecimal", false);
        setBooleanField(term1228, term1228.getClass(), "isCurrencyFormat", false);
        setCharField(term1277, term1277.getClass(), "zeroDigit", (char) 48);
        setCharField(term1277, term1277.getClass(), "groupingSeparator", (char) 44);
        setCharField(term1277, term1277.getClass(), "decimalSeparator", (char) 46);
        setCharField(term1277, term1277.getClass(), "perMill", (char) 8240);
        setCharField(term1277, term1277.getClass(), "percent", (char) 37);
        setCharField(term1277, term1277.getClass(), "digit", (char) 35);
        setCharField(term1277, term1277.getClass(), "patternSeparator", (char) 59);
        setField(term1277, term1277.getClass(), "infinity", "\u001E\"");
        setField(term1277, term1277.getClass(), "NaN", "NaN");
        setCharField(term1277, term1277.getClass(), "minusSign", (char) 45);
        setField(term1277, term1277.getClass(), "currencySymbol", null);
        setField(term1277, term1277.getClass(), "intlCurrencySymbol", null);
        setCharField(term1277, term1277.getClass(), "monetarySeparator", (char) 46);
        setCharField(term1277, term1277.getClass(), "exponential", 'E');
        setField(term1277, term1277.getClass(), "exponentialSeparator", "E");
        setField(term1277, term1277.getClass(), "locale", term1201);
        setField(term1277, term1277.getClass(), "currency", null);
        setBooleanField(term1277, term1277.getClass(), "currencyInitialized", false);
        setIntField(term1277, term1277.getClass(), "serialVersionOnStream", 3);
        setField(term1228, term1228.getClass(), "symbols", term1277);
        setBooleanField(term1228, term1228.getClass(), "useExponentialNotation", false);
        setField(term1228, term1228.getClass(), "positivePrefixFieldPositions", null);
        setField(term1228, term1228.getClass(), "positiveSuffixFieldPositions", null);
        setField(term1228, term1228.getClass(), "negativePrefixFieldPositions", null);
        setField(term1228, term1228.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term1228, term1228.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term1228, term1228.getClass(), "maximumIntegerDigits", 309);
        setIntField(term1228, term1228.getClass(), "minimumIntegerDigits", 1);
        setIntField(term1228, term1228.getClass(), "maximumFractionDigits", 2);
        setIntField(term1228, term1228.getClass(), "minimumFractionDigits", 0);
        setField(term1228, term1228.getClass(), "roundingMode", enum22);
        setBooleanField(term1228, term1228.getClass(), "isFastPath", false);
        setBooleanField(term1228, term1228.getClass(), "fastPathCheckNeeded", true);
        setField(term1228, term1228.getClass(), "fastPathData", null);
        setIntField(term1228, term1228.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term1228, term1228.getClass(), "groupingUsed", true);
        setByteField(term1228, term1228.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term1228, term1228.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term1228, term1228.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term1228, term1228.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term1228, term1228.getClass(), "parseIntegerOnly", false);
        setField(term1121, term1121.getClass(), "realFormat", term1228);
        term1322 = new Double(0.28570734989730284);
        term1324 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1337 = (byte[]) newByteArray(16);
        setField(term1324, term1324.getClass(), "toStringCache", "MjGYSRKTNF");
        setField(term1324, term1324.getClass(), "value", term1337);
        setByteField(term1324, term1324.getClass(), "coder", (byte) 89);
        setIntField(term1324, term1324.getClass(), "count", 1227103734);
        term1356 = newInstance(Class.forName("java.text.FieldPosition"));
        Object term1360 = newInstance(Class.forName("java.text.Format$Field"));
        setIntField(term1356, term1356.getClass(), "field", -1339778481);
        setIntField(term1356, term1356.getClass(), "endIndex", 1725571209);
        setIntField(term1356, term1356.getClass(), "beginIndex", -522618178);
        setField(term1360, term1360.getClass(), "name", "hRNSzYYIrc");
        setField(term1356, term1356.getClass(), "attribute", term1360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("java.text.NumberFormat");
        argTypes[2] = Class.forName("java.lang.StringBuffer");
        argTypes[3] = Class.forName("java.text.FieldPosition");
        Object[] args = new Object[4];
        args[0] = term1322;
        args[1] = null;
        args[2] = term1324;
        args[3] = term1356;
        try {
            callMethod(klass, "formatDouble", argTypes, term1121, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


