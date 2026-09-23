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

public class ComplexFormat_getDefaultNumberFormat_128579840940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1604;
     Object term29203;
     Object term29085;

    public ComplexFormat_getDefaultNumberFormat_128579840940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1604 = newInstance(Class.forName("java.util.Locale"));
        Object term1605 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1605, term1605.getClass(), "language", "pt");
        setField(term1605, term1605.getClass(), "script", "");
        setField(term1605, term1605.getClass(), "region", "MO");
        setField(term1605, term1605.getClass(), "variant", "");
        setIntField(term1605, term1605.getClass(), "hash", 106966554);
        setField(term1604, term1604.getClass(), "baseLocale", term1605);
        setField(term1604, term1604.getClass(), "localeExtensions", null);
        setIntField(term1604, term1604.getClass(), "hashCodeValue", 106966554);
        setField(term1604, term1604.getClass(), "languageTag", null);
        term29203 = newInstance(Class.forName("java.util.Locale"));
        Object term29204 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term29204, term29204.getClass(), "language", "");
        setField(term29204, term29204.getClass(), "script", "");
        setField(term29204, term29204.getClass(), "region", "");
        setField(term29204, term29204.getClass(), "variant", "");
        setIntField(term29204, term29204.getClass(), "hash", 106966554);
        setField(term29203, term29203.getClass(), "baseLocale", term29204);
        setField(term29203, term29203.getClass(), "localeExtensions", null);
        setIntField(term29203, term29203.getClass(), "hashCodeValue", 106966554);
        setField(term29203, term29203.getClass(), "languageTag", "pt-MO");
        Class<? extends Object> term29240 = Class.forName((String) "java.math.RoundingMode");
        Field term29239 = ((Class) term29240).getDeclaredField((String) "HALF_EVEN");
        ((Field) term29239).setAccessible(true);
        Object enum24 = ((Field) term29239).get((Object) null);
        term29085 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term29086 = newInstance(Class.forName("java.text.DigitList"));
        char[] term29089 = (char[]) newCharArray(19);
        Object term29148 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        Object term29171 = newInstance(Class.forName("java.util.Locale"));
        Object term29172 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term29085, term29085.getClass(), "bigIntegerMultiplier", null);
        setField(term29085, term29085.getClass(), "bigDecimalMultiplier", null);
        setIntField(term29086, term29086.getClass(), "decimalAt", 0);
        setIntField(term29086, term29086.getClass(), "count", 0);
        setField(term29086, term29086.getClass(), "digits", term29089);
        setField(term29086, term29086.getClass(), "data", null);
        setField(term29086, term29086.getClass(), "roundingMode", enum24);
        setBooleanField(term29086, term29086.getClass(), "isNegative", false);
        setField(term29086, term29086.getClass(), "tempBuffer", null);
        setField(term29085, term29085.getClass(), "digitList", term29086);
        setField(term29085, term29085.getClass(), "positivePrefix", "");
        setField(term29085, term29085.getClass(), "positiveSuffix", "");
        setField(term29085, term29085.getClass(), "negativePrefix", "-");
        setField(term29085, term29085.getClass(), "negativeSuffix", "");
        setField(term29085, term29085.getClass(), "posPrefixPattern", "");
        setField(term29085, term29085.getClass(), "posSuffixPattern", "");
        setField(term29085, term29085.getClass(), "negPrefixPattern", "\'-");
        setField(term29085, term29085.getClass(), "negSuffixPattern", "");
        setIntField(term29085, term29085.getClass(), "multiplier", 1);
        setByteField(term29085, term29085.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term29085, term29085.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term29085, term29085.getClass(), "parseBigDecimal", false);
        setBooleanField(term29085, term29085.getClass(), "isCurrencyFormat", false);
        setCharField(term29148, term29148.getClass(), "zeroDigit", (char) 48);
        setCharField(term29148, term29148.getClass(), "groupingSeparator", (char) 160);
        setCharField(term29148, term29148.getClass(), "decimalSeparator", (char) 44);
        setCharField(term29148, term29148.getClass(), "perMill", (char) 8240);
        setCharField(term29148, term29148.getClass(), "percent", (char) 37);
        setCharField(term29148, term29148.getClass(), "digit", (char) 35);
        setCharField(term29148, term29148.getClass(), "patternSeparator", (char) 59);
        setField(term29148, term29148.getClass(), "infinity", "\u001E\"");
        setField(term29148, term29148.getClass(), "NaN", "NaN");
        setCharField(term29148, term29148.getClass(), "minusSign", (char) 45);
        setField(term29148, term29148.getClass(), "currencySymbol", null);
        setField(term29148, term29148.getClass(), "intlCurrencySymbol", null);
        setCharField(term29148, term29148.getClass(), "monetarySeparator", (char) 44);
        setCharField(term29148, term29148.getClass(), "exponential", 'E');
        setField(term29148, term29148.getClass(), "exponentialSeparator", "E");
        setField(term29172, term29172.getClass(), "language", "");
        setField(term29172, term29172.getClass(), "script", "");
        setField(term29172, term29172.getClass(), "region", "");
        setField(term29172, term29172.getClass(), "variant", "");
        setIntField(term29172, term29172.getClass(), "hash", 106966554);
        setField(term29171, term29171.getClass(), "baseLocale", term29172);
        setField(term29171, term29171.getClass(), "localeExtensions", null);
        setIntField(term29171, term29171.getClass(), "hashCodeValue", 106966554);
        setField(term29171, term29171.getClass(), "languageTag", "pt-MO");
        setField(term29148, term29148.getClass(), "locale", term29171);
        setField(term29148, term29148.getClass(), "currency", null);
        setBooleanField(term29148, term29148.getClass(), "currencyInitialized", false);
        setIntField(term29148, term29148.getClass(), "serialVersionOnStream", 3);
        setField(term29085, term29085.getClass(), "symbols", term29148);
        setBooleanField(term29085, term29085.getClass(), "useExponentialNotation", false);
        setField(term29085, term29085.getClass(), "positivePrefixFieldPositions", null);
        setField(term29085, term29085.getClass(), "positiveSuffixFieldPositions", null);
        setField(term29085, term29085.getClass(), "negativePrefixFieldPositions", null);
        setField(term29085, term29085.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term29085, term29085.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term29085, term29085.getClass(), "maximumIntegerDigits", 309);
        setIntField(term29085, term29085.getClass(), "minimumIntegerDigits", 1);
        setIntField(term29085, term29085.getClass(), "maximumFractionDigits", 2);
        setIntField(term29085, term29085.getClass(), "minimumFractionDigits", 0);
        setField(term29085, term29085.getClass(), "roundingMode", enum24);
        setBooleanField(term29085, term29085.getClass(), "isFastPath", false);
        setBooleanField(term29085, term29085.getClass(), "fastPathCheckNeeded", true);
        setField(term29085, term29085.getClass(), "fastPathData", null);
        setIntField(term29085, term29085.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term29085, term29085.getClass(), "groupingUsed", true);
        setByteField(term29085, term29085.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term29085, term29085.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term29085, term29085.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term29085, term29085.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term29085, term29085.getClass(), "parseIntegerOnly", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = term1604;
        Object retValue = callMethod(klass, "getDefaultNumberFormat", argTypes, null, args);
        assertTrue(recursiveEquals(term1604, term29203));
        assertTrue(recursiveEquals(retValue, term29085));
    }

};


