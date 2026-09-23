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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.complex.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class ComplexFormat_getInstance_191405179843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31769;

    public ComplexFormat_getInstance_191405179843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31981 = Class.forName((String) "java.math.RoundingMode");
        Field term31980 = ((Class) term31981).getDeclaredField((String) "HALF_UP");
        ((Field) term31980).setAccessible(true);
        Object enum30 = ((Field) term31980).get((Object) null);
        term31769 = newInstance(Class.forName("org.apache.commons.math.complex.ComplexFormat"));
        Object term31773 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term31774 = newInstance(Class.forName("java.text.DigitList"));
        char[] term31777 = (char[]) newCharArray(19);
        Object term31826 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        Object term31849 = newInstance(Class.forName("java.util.Locale"));
        Object term31850 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term31871 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term31872 = newInstance(Class.forName("java.text.DigitList"));
        char[] term31875 = (char[]) newCharArray(19);
        Object term31920 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        setField(term31769, term31769.getClass(), "imaginaryCharacter", "i");
        setField(term31773, term31773.getClass(), "bigIntegerMultiplier", null);
        setField(term31773, term31773.getClass(), "bigDecimalMultiplier", null);
        setIntField(term31774, term31774.getClass(), "decimalAt", 0);
        setIntField(term31774, term31774.getClass(), "count", 0);
        setField(term31774, term31774.getClass(), "digits", term31777);
        setField(term31774, term31774.getClass(), "data", null);
        setField(term31774, term31774.getClass(), "roundingMode", enum30);
        setBooleanField(term31774, term31774.getClass(), "isNegative", false);
        setField(term31774, term31774.getClass(), "tempBuffer", null);
        setField(term31773, term31773.getClass(), "digitList", term31774);
        setField(term31773, term31773.getClass(), "positivePrefix", "");
        setField(term31773, term31773.getClass(), "positiveSuffix", "");
        setField(term31773, term31773.getClass(), "negativePrefix", "-");
        setField(term31773, term31773.getClass(), "negativeSuffix", "");
        setField(term31773, term31773.getClass(), "posPrefixPattern", "");
        setField(term31773, term31773.getClass(), "posSuffixPattern", "");
        setField(term31773, term31773.getClass(), "negPrefixPattern", "\'-");
        setField(term31773, term31773.getClass(), "negSuffixPattern", "");
        setIntField(term31773, term31773.getClass(), "multiplier", 1);
        setByteField(term31773, term31773.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term31773, term31773.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term31773, term31773.getClass(), "parseBigDecimal", false);
        setBooleanField(term31773, term31773.getClass(), "isCurrencyFormat", false);
        setCharField(term31826, term31826.getClass(), "zeroDigit", (char) 48);
        setCharField(term31826, term31826.getClass(), "groupingSeparator", (char) 44);
        setCharField(term31826, term31826.getClass(), "decimalSeparator", (char) 46);
        setCharField(term31826, term31826.getClass(), "perMill", (char) 8240);
        setCharField(term31826, term31826.getClass(), "percent", (char) 37);
        setCharField(term31826, term31826.getClass(), "digit", (char) 35);
        setCharField(term31826, term31826.getClass(), "patternSeparator", (char) 59);
        setField(term31826, term31826.getClass(), "infinity", "\u001E\"");
        setField(term31826, term31826.getClass(), "NaN", "NaN");
        setCharField(term31826, term31826.getClass(), "minusSign", (char) 45);
        setField(term31826, term31826.getClass(), "currencySymbol", null);
        setField(term31826, term31826.getClass(), "intlCurrencySymbol", null);
        setCharField(term31826, term31826.getClass(), "monetarySeparator", (char) 46);
        setCharField(term31826, term31826.getClass(), "exponential", 'E');
        setField(term31826, term31826.getClass(), "exponentialSeparator", "E");
        setField(term31850, term31850.getClass(), "language", null);
        setField(term31850, term31850.getClass(), "script", null);
        setField(term31850, term31850.getClass(), "region", null);
        setField(term31850, term31850.getClass(), "variant", null);
        setIntField(term31850, term31850.getClass(), "hash", 96636889);
        setField(term31849, term31849.getClass(), "baseLocale", term31850);
        setField(term31849, term31849.getClass(), "localeExtensions", null);
        setIntField(term31849, term31849.getClass(), "hashCodeValue", 96636889);
        setField(term31849, term31849.getClass(), "languageTag", "");
        setField(term31826, term31826.getClass(), "locale", term31849);
        setField(term31826, term31826.getClass(), "currency", null);
        setBooleanField(term31826, term31826.getClass(), "currencyInitialized", false);
        setIntField(term31826, term31826.getClass(), "serialVersionOnStream", 3);
        setField(term31773, term31773.getClass(), "symbols", term31826);
        setBooleanField(term31773, term31773.getClass(), "useExponentialNotation", false);
        setField(term31773, term31773.getClass(), "positivePrefixFieldPositions", null);
        setField(term31773, term31773.getClass(), "positiveSuffixFieldPositions", null);
        setField(term31773, term31773.getClass(), "negativePrefixFieldPositions", null);
        setField(term31773, term31773.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term31773, term31773.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term31773, term31773.getClass(), "maximumIntegerDigits", 309);
        setIntField(term31773, term31773.getClass(), "minimumIntegerDigits", 1);
        setIntField(term31773, term31773.getClass(), "maximumFractionDigits", 2);
        setIntField(term31773, term31773.getClass(), "minimumFractionDigits", 0);
        setField(term31773, term31773.getClass(), "roundingMode", enum30);
        setBooleanField(term31773, term31773.getClass(), "isFastPath", false);
        setBooleanField(term31773, term31773.getClass(), "fastPathCheckNeeded", true);
        setField(term31773, term31773.getClass(), "fastPathData", null);
        setIntField(term31773, term31773.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term31773, term31773.getClass(), "groupingUsed", true);
        setByteField(term31773, term31773.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term31773, term31773.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term31773, term31773.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term31773, term31773.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term31773, term31773.getClass(), "parseIntegerOnly", false);
        setField(term31769, term31769.getClass(), "imaginaryFormat", term31773);
        setField(term31871, term31871.getClass(), "bigIntegerMultiplier", null);
        setField(term31871, term31871.getClass(), "bigDecimalMultiplier", null);
        setIntField(term31872, term31872.getClass(), "decimalAt", 0);
        setIntField(term31872, term31872.getClass(), "count", 0);
        setField(term31872, term31872.getClass(), "digits", term31875);
        setField(term31872, term31872.getClass(), "data", null);
        setField(term31872, term31872.getClass(), "roundingMode", enum30);
        setBooleanField(term31872, term31872.getClass(), "isNegative", false);
        setField(term31872, term31872.getClass(), "tempBuffer", null);
        setField(term31871, term31871.getClass(), "digitList", term31872);
        setField(term31871, term31871.getClass(), "positivePrefix", "");
        setField(term31871, term31871.getClass(), "positiveSuffix", "");
        setField(term31871, term31871.getClass(), "negativePrefix", "-");
        setField(term31871, term31871.getClass(), "negativeSuffix", "");
        setField(term31871, term31871.getClass(), "posPrefixPattern", "");
        setField(term31871, term31871.getClass(), "posSuffixPattern", "");
        setField(term31871, term31871.getClass(), "negPrefixPattern", "\'-");
        setField(term31871, term31871.getClass(), "negSuffixPattern", "");
        setIntField(term31871, term31871.getClass(), "multiplier", 1);
        setByteField(term31871, term31871.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term31871, term31871.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term31871, term31871.getClass(), "parseBigDecimal", false);
        setBooleanField(term31871, term31871.getClass(), "isCurrencyFormat", false);
        setCharField(term31920, term31920.getClass(), "zeroDigit", (char) 48);
        setCharField(term31920, term31920.getClass(), "groupingSeparator", (char) 44);
        setCharField(term31920, term31920.getClass(), "decimalSeparator", (char) 46);
        setCharField(term31920, term31920.getClass(), "perMill", (char) 8240);
        setCharField(term31920, term31920.getClass(), "percent", (char) 37);
        setCharField(term31920, term31920.getClass(), "digit", (char) 35);
        setCharField(term31920, term31920.getClass(), "patternSeparator", (char) 59);
        setField(term31920, term31920.getClass(), "infinity", "\u001E\"");
        setField(term31920, term31920.getClass(), "NaN", "NaN");
        setCharField(term31920, term31920.getClass(), "minusSign", (char) 45);
        setField(term31920, term31920.getClass(), "currencySymbol", null);
        setField(term31920, term31920.getClass(), "intlCurrencySymbol", null);
        setCharField(term31920, term31920.getClass(), "monetarySeparator", (char) 46);
        setCharField(term31920, term31920.getClass(), "exponential", 'E');
        setField(term31920, term31920.getClass(), "exponentialSeparator", "E");
        setField(term31920, term31920.getClass(), "locale", term31849);
        setField(term31920, term31920.getClass(), "currency", null);
        setBooleanField(term31920, term31920.getClass(), "currencyInitialized", false);
        setIntField(term31920, term31920.getClass(), "serialVersionOnStream", 3);
        setField(term31871, term31871.getClass(), "symbols", term31920);
        setBooleanField(term31871, term31871.getClass(), "useExponentialNotation", false);
        setField(term31871, term31871.getClass(), "positivePrefixFieldPositions", null);
        setField(term31871, term31871.getClass(), "positiveSuffixFieldPositions", null);
        setField(term31871, term31871.getClass(), "negativePrefixFieldPositions", null);
        setField(term31871, term31871.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term31871, term31871.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term31871, term31871.getClass(), "maximumIntegerDigits", 309);
        setIntField(term31871, term31871.getClass(), "minimumIntegerDigits", 1);
        setIntField(term31871, term31871.getClass(), "maximumFractionDigits", 2);
        setIntField(term31871, term31871.getClass(), "minimumFractionDigits", 0);
        setField(term31871, term31871.getClass(), "roundingMode", enum30);
        setBooleanField(term31871, term31871.getClass(), "isFastPath", false);
        setBooleanField(term31871, term31871.getClass(), "fastPathCheckNeeded", true);
        setField(term31871, term31871.getClass(), "fastPathData", null);
        setIntField(term31871, term31871.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term31871, term31871.getClass(), "groupingUsed", true);
        setByteField(term31871, term31871.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term31871, term31871.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term31871, term31871.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term31871, term31871.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term31871, term31871.getClass(), "parseIntegerOnly", false);
        setField(term31769, term31769.getClass(), "realFormat", term31871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getInstance", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term31769));
    }

};


