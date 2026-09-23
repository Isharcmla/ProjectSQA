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
import java.lang.Object;
import java.lang.String;

public class ComplexFormat_setRealFormat_48907565527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6597;

    public ComplexFormat_setRealFormat_48907565527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6819 = Class.forName((String) "java.math.RoundingMode");
        Field term6818 = ((Class) term6819).getDeclaredField((String) "DOWN");
        ((Field) term6818).setAccessible(true);
        Object enum15 = ((Field) term6818).get((Object) null);
        term6597 = newInstance(Class.forName("org.apache.commons.math.complex.ComplexFormat"));
        Object term6601 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term6602 = newInstance(Class.forName("java.text.DigitList"));
        char[] term6605 = (char[]) newCharArray(19);
        Object term6654 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        Object term6677 = newInstance(Class.forName("java.util.Locale"));
        Object term6678 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term6704 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term6705 = newInstance(Class.forName("java.text.DigitList"));
        char[] term6708 = (char[]) newCharArray(19);
        Object term6753 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        setField(term6597, term6597.getClass(), "imaginaryCharacter", "i");
        setField(term6601, term6601.getClass(), "bigIntegerMultiplier", null);
        setField(term6601, term6601.getClass(), "bigDecimalMultiplier", null);
        setIntField(term6602, term6602.getClass(), "decimalAt", 0);
        setIntField(term6602, term6602.getClass(), "count", 0);
        setField(term6602, term6602.getClass(), "digits", term6605);
        setField(term6602, term6602.getClass(), "data", null);
        setField(term6602, term6602.getClass(), "roundingMode", enum15);
        setBooleanField(term6602, term6602.getClass(), "isNegative", false);
        setField(term6602, term6602.getClass(), "tempBuffer", null);
        setField(term6601, term6601.getClass(), "digitList", term6602);
        setField(term6601, term6601.getClass(), "positivePrefix", "");
        setField(term6601, term6601.getClass(), "positiveSuffix", "");
        setField(term6601, term6601.getClass(), "negativePrefix", "-");
        setField(term6601, term6601.getClass(), "negativeSuffix", "");
        setField(term6601, term6601.getClass(), "posPrefixPattern", "");
        setField(term6601, term6601.getClass(), "posSuffixPattern", "");
        setField(term6601, term6601.getClass(), "negPrefixPattern", "\'-");
        setField(term6601, term6601.getClass(), "negSuffixPattern", "");
        setIntField(term6601, term6601.getClass(), "multiplier", 1);
        setByteField(term6601, term6601.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term6601, term6601.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term6601, term6601.getClass(), "parseBigDecimal", false);
        setBooleanField(term6601, term6601.getClass(), "isCurrencyFormat", false);
        setCharField(term6654, term6654.getClass(), "zeroDigit", (char) 48);
        setCharField(term6654, term6654.getClass(), "groupingSeparator", (char) 44);
        setCharField(term6654, term6654.getClass(), "decimalSeparator", (char) 46);
        setCharField(term6654, term6654.getClass(), "perMill", (char) 8240);
        setCharField(term6654, term6654.getClass(), "percent", (char) 37);
        setCharField(term6654, term6654.getClass(), "digit", (char) 35);
        setCharField(term6654, term6654.getClass(), "patternSeparator", (char) 59);
        setField(term6654, term6654.getClass(), "infinity", "\u001E\"");
        setField(term6654, term6654.getClass(), "NaN", "NaN");
        setCharField(term6654, term6654.getClass(), "minusSign", (char) 45);
        setField(term6654, term6654.getClass(), "currencySymbol", null);
        setField(term6654, term6654.getClass(), "intlCurrencySymbol", null);
        setCharField(term6654, term6654.getClass(), "monetarySeparator", (char) 46);
        setCharField(term6654, term6654.getClass(), "exponential", 'E');
        setField(term6654, term6654.getClass(), "exponentialSeparator", "E");
        setField(term6678, term6678.getClass(), "language", null);
        setField(term6678, term6678.getClass(), "script", null);
        setField(term6678, term6678.getClass(), "region", null);
        setField(term6678, term6678.getClass(), "variant", null);
        setIntField(term6678, term6678.getClass(), "hash", 96636889);
        setField(term6677, term6677.getClass(), "baseLocale", term6678);
        setField(term6677, term6677.getClass(), "localeExtensions", null);
        setIntField(term6677, term6677.getClass(), "hashCodeValue", 96636889);
        setField(term6677, term6677.getClass(), "languageTag", "");
        setField(term6654, term6654.getClass(), "locale", term6677);
        setField(term6654, term6654.getClass(), "currency", null);
        setBooleanField(term6654, term6654.getClass(), "currencyInitialized", false);
        setIntField(term6654, term6654.getClass(), "serialVersionOnStream", 3);
        setField(term6601, term6601.getClass(), "symbols", term6654);
        setBooleanField(term6601, term6601.getClass(), "useExponentialNotation", false);
        setField(term6601, term6601.getClass(), "positivePrefixFieldPositions", null);
        setField(term6601, term6601.getClass(), "positiveSuffixFieldPositions", null);
        setField(term6601, term6601.getClass(), "negativePrefixFieldPositions", null);
        setField(term6601, term6601.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term6601, term6601.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term6601, term6601.getClass(), "maximumIntegerDigits", 309);
        setIntField(term6601, term6601.getClass(), "minimumIntegerDigits", 1);
        setIntField(term6601, term6601.getClass(), "maximumFractionDigits", 2);
        setIntField(term6601, term6601.getClass(), "minimumFractionDigits", 0);
        setField(term6601, term6601.getClass(), "roundingMode", enum15);
        setBooleanField(term6601, term6601.getClass(), "isFastPath", false);
        setBooleanField(term6601, term6601.getClass(), "fastPathCheckNeeded", true);
        setField(term6601, term6601.getClass(), "fastPathData", null);
        setIntField(term6601, term6601.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term6601, term6601.getClass(), "groupingUsed", true);
        setByteField(term6601, term6601.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term6601, term6601.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term6601, term6601.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term6601, term6601.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term6601, term6601.getClass(), "parseIntegerOnly", false);
        setField(term6597, term6597.getClass(), "imaginaryFormat", term6601);
        setField(term6704, term6704.getClass(), "bigIntegerMultiplier", null);
        setField(term6704, term6704.getClass(), "bigDecimalMultiplier", null);
        setIntField(term6705, term6705.getClass(), "decimalAt", 0);
        setIntField(term6705, term6705.getClass(), "count", 0);
        setField(term6705, term6705.getClass(), "digits", term6708);
        setField(term6705, term6705.getClass(), "data", null);
        setField(term6705, term6705.getClass(), "roundingMode", enum15);
        setBooleanField(term6705, term6705.getClass(), "isNegative", false);
        setField(term6705, term6705.getClass(), "tempBuffer", null);
        setField(term6704, term6704.getClass(), "digitList", term6705);
        setField(term6704, term6704.getClass(), "positivePrefix", "");
        setField(term6704, term6704.getClass(), "positiveSuffix", "");
        setField(term6704, term6704.getClass(), "negativePrefix", "-");
        setField(term6704, term6704.getClass(), "negativeSuffix", "");
        setField(term6704, term6704.getClass(), "posPrefixPattern", "");
        setField(term6704, term6704.getClass(), "posSuffixPattern", "");
        setField(term6704, term6704.getClass(), "negPrefixPattern", "\'-");
        setField(term6704, term6704.getClass(), "negSuffixPattern", "");
        setIntField(term6704, term6704.getClass(), "multiplier", 1);
        setByteField(term6704, term6704.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term6704, term6704.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term6704, term6704.getClass(), "parseBigDecimal", false);
        setBooleanField(term6704, term6704.getClass(), "isCurrencyFormat", false);
        setCharField(term6753, term6753.getClass(), "zeroDigit", (char) 48);
        setCharField(term6753, term6753.getClass(), "groupingSeparator", (char) 44);
        setCharField(term6753, term6753.getClass(), "decimalSeparator", (char) 46);
        setCharField(term6753, term6753.getClass(), "perMill", (char) 8240);
        setCharField(term6753, term6753.getClass(), "percent", (char) 37);
        setCharField(term6753, term6753.getClass(), "digit", (char) 35);
        setCharField(term6753, term6753.getClass(), "patternSeparator", (char) 59);
        setField(term6753, term6753.getClass(), "infinity", "\u001E\"");
        setField(term6753, term6753.getClass(), "NaN", "NaN");
        setCharField(term6753, term6753.getClass(), "minusSign", (char) 45);
        setField(term6753, term6753.getClass(), "currencySymbol", null);
        setField(term6753, term6753.getClass(), "intlCurrencySymbol", null);
        setCharField(term6753, term6753.getClass(), "monetarySeparator", (char) 46);
        setCharField(term6753, term6753.getClass(), "exponential", 'E');
        setField(term6753, term6753.getClass(), "exponentialSeparator", "E");
        setField(term6753, term6753.getClass(), "locale", term6677);
        setField(term6753, term6753.getClass(), "currency", null);
        setBooleanField(term6753, term6753.getClass(), "currencyInitialized", false);
        setIntField(term6753, term6753.getClass(), "serialVersionOnStream", 3);
        setField(term6704, term6704.getClass(), "symbols", term6753);
        setBooleanField(term6704, term6704.getClass(), "useExponentialNotation", false);
        setField(term6704, term6704.getClass(), "positivePrefixFieldPositions", null);
        setField(term6704, term6704.getClass(), "positiveSuffixFieldPositions", null);
        setField(term6704, term6704.getClass(), "negativePrefixFieldPositions", null);
        setField(term6704, term6704.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term6704, term6704.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term6704, term6704.getClass(), "maximumIntegerDigits", 309);
        setIntField(term6704, term6704.getClass(), "minimumIntegerDigits", 1);
        setIntField(term6704, term6704.getClass(), "maximumFractionDigits", 2);
        setIntField(term6704, term6704.getClass(), "minimumFractionDigits", 0);
        setField(term6704, term6704.getClass(), "roundingMode", enum15);
        setBooleanField(term6704, term6704.getClass(), "isFastPath", false);
        setBooleanField(term6704, term6704.getClass(), "fastPathCheckNeeded", true);
        setField(term6704, term6704.getClass(), "fastPathData", null);
        setIntField(term6704, term6704.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term6704, term6704.getClass(), "groupingUsed", true);
        setByteField(term6704, term6704.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term6704, term6704.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term6704, term6704.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term6704, term6704.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term6704, term6704.getClass(), "parseIntegerOnly", false);
        setField(term6597, term6597.getClass(), "realFormat", term6704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.text.NumberFormat");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRealFormat", argTypes, term6597, args);
    }

};


