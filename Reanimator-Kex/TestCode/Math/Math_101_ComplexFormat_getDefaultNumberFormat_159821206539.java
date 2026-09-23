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

public class ComplexFormat_getDefaultNumberFormat_159821206539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28239;

    public ComplexFormat_getDefaultNumberFormat_159821206539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28692 = Class.forName((String) "java.math.RoundingMode");
        Field term28691 = ((Class) term28692).getDeclaredField((String) "HALF_EVEN");
        ((Field) term28691).setAccessible(true);
        Object enum23 = ((Field) term28691).get((Object) null);
        term28239 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term28242 = newInstance(Class.forName("java.text.DigitList"));
        char[] term28247 = (char[]) newCharArray(19);
        Object term28313 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        Object term28342 = newInstance(Class.forName("java.util.Locale"));
        Object term28343 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term28239, term28239.getClass(), "bigIntegerMultiplier", null);
        setField(term28239, term28239.getClass(), "bigDecimalMultiplier", null);
        setIntField(term28242, term28242.getClass(), "decimalAt", 0);
        setIntField(term28242, term28242.getClass(), "count", 0);
        setField(term28242, term28242.getClass(), "digits", term28247);
        setField(term28242, term28242.getClass(), "data", null);
        setField(term28242, term28242.getClass(), "roundingMode", enum23);
        setBooleanField(term28242, term28242.getClass(), "isNegative", false);
        setField(term28242, term28242.getClass(), "tempBuffer", null);
        setField(term28239, term28239.getClass(), "digitList", term28242);
        setField(term28239, term28239.getClass(), "positivePrefix", "");
        setField(term28239, term28239.getClass(), "positiveSuffix", "");
        setField(term28239, term28239.getClass(), "negativePrefix", "-");
        setField(term28239, term28239.getClass(), "negativeSuffix", "");
        setField(term28239, term28239.getClass(), "posPrefixPattern", "");
        setField(term28239, term28239.getClass(), "posSuffixPattern", "");
        setField(term28239, term28239.getClass(), "negPrefixPattern", "\'-");
        setField(term28239, term28239.getClass(), "negSuffixPattern", "");
        setIntField(term28239, term28239.getClass(), "multiplier", 1);
        setByteField(term28239, term28239.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term28239, term28239.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term28239, term28239.getClass(), "parseBigDecimal", false);
        setBooleanField(term28239, term28239.getClass(), "isCurrencyFormat", false);
        setCharField(term28313, term28313.getClass(), "zeroDigit", (char) 48);
        setCharField(term28313, term28313.getClass(), "groupingSeparator", (char) 44);
        setCharField(term28313, term28313.getClass(), "decimalSeparator", (char) 46);
        setCharField(term28313, term28313.getClass(), "perMill", (char) 8240);
        setCharField(term28313, term28313.getClass(), "percent", (char) 37);
        setCharField(term28313, term28313.getClass(), "digit", (char) 35);
        setCharField(term28313, term28313.getClass(), "patternSeparator", (char) 59);
        setField(term28313, term28313.getClass(), "infinity", "\u001E\"");
        setField(term28313, term28313.getClass(), "NaN", "NaN");
        setCharField(term28313, term28313.getClass(), "minusSign", (char) 45);
        setField(term28313, term28313.getClass(), "currencySymbol", null);
        setField(term28313, term28313.getClass(), "intlCurrencySymbol", null);
        setCharField(term28313, term28313.getClass(), "monetarySeparator", (char) 46);
        setCharField(term28313, term28313.getClass(), "exponential", 'E');
        setField(term28313, term28313.getClass(), "exponentialSeparator", "E");
        setField(term28343, term28343.getClass(), "language", "");
        setField(term28343, term28343.getClass(), "script", "");
        setField(term28343, term28343.getClass(), "region", "");
        setField(term28343, term28343.getClass(), "variant", "");
        setIntField(term28343, term28343.getClass(), "hash", 96636889);
        setField(term28342, term28342.getClass(), "baseLocale", term28343);
        setField(term28342, term28342.getClass(), "localeExtensions", null);
        setIntField(term28342, term28342.getClass(), "hashCodeValue", 96636889);
        setField(term28342, term28342.getClass(), "languageTag", "en-US");
        setField(term28313, term28313.getClass(), "locale", term28342);
        setField(term28313, term28313.getClass(), "currency", null);
        setBooleanField(term28313, term28313.getClass(), "currencyInitialized", false);
        setIntField(term28313, term28313.getClass(), "serialVersionOnStream", 3);
        setField(term28239, term28239.getClass(), "symbols", term28313);
        setBooleanField(term28239, term28239.getClass(), "useExponentialNotation", false);
        setField(term28239, term28239.getClass(), "positivePrefixFieldPositions", null);
        setField(term28239, term28239.getClass(), "positiveSuffixFieldPositions", null);
        setField(term28239, term28239.getClass(), "negativePrefixFieldPositions", null);
        setField(term28239, term28239.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term28239, term28239.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term28239, term28239.getClass(), "maximumIntegerDigits", 309);
        setIntField(term28239, term28239.getClass(), "minimumIntegerDigits", 1);
        setIntField(term28239, term28239.getClass(), "maximumFractionDigits", 2);
        setIntField(term28239, term28239.getClass(), "minimumFractionDigits", 0);
        setField(term28239, term28239.getClass(), "roundingMode", enum23);
        setBooleanField(term28239, term28239.getClass(), "isFastPath", false);
        setBooleanField(term28239, term28239.getClass(), "fastPathCheckNeeded", true);
        setField(term28239, term28239.getClass(), "fastPathData", null);
        setIntField(term28239, term28239.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term28239, term28239.getClass(), "groupingUsed", true);
        setByteField(term28239, term28239.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term28239, term28239.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term28239, term28239.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term28239, term28239.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term28239, term28239.getClass(), "parseIntegerOnly", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNumberFormat", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term28239));
    }

};


