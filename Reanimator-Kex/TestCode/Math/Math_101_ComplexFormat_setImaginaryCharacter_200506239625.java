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

public class ComplexFormat_setImaginaryCharacter_200506239625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5777;

    public ComplexFormat_setImaginaryCharacter_200506239625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6011 = Class.forName((String) "java.math.RoundingMode");
        Field term6010 = ((Class) term6011).getDeclaredField((String) "HALF_EVEN");
        ((Field) term6010).setAccessible(true);
        Object enum13 = ((Field) term6010).get((Object) null);
        term5777 = newInstance(Class.forName("org.apache.commons.math.complex.ComplexFormat"));
        Object term5781 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term5782 = newInstance(Class.forName("java.text.DigitList"));
        char[] term5785 = (char[]) newCharArray(19);
        Object term5834 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        Object term5857 = newInstance(Class.forName("java.util.Locale"));
        Object term5858 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term5884 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term5885 = newInstance(Class.forName("java.text.DigitList"));
        char[] term5888 = (char[]) newCharArray(19);
        Object term5933 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        setField(term5777, term5777.getClass(), "imaginaryCharacter", "i");
        setField(term5781, term5781.getClass(), "bigIntegerMultiplier", null);
        setField(term5781, term5781.getClass(), "bigDecimalMultiplier", null);
        setIntField(term5782, term5782.getClass(), "decimalAt", 0);
        setIntField(term5782, term5782.getClass(), "count", 0);
        setField(term5782, term5782.getClass(), "digits", term5785);
        setField(term5782, term5782.getClass(), "data", null);
        setField(term5782, term5782.getClass(), "roundingMode", enum13);
        setBooleanField(term5782, term5782.getClass(), "isNegative", false);
        setField(term5782, term5782.getClass(), "tempBuffer", null);
        setField(term5781, term5781.getClass(), "digitList", term5782);
        setField(term5781, term5781.getClass(), "positivePrefix", "");
        setField(term5781, term5781.getClass(), "positiveSuffix", "");
        setField(term5781, term5781.getClass(), "negativePrefix", "-");
        setField(term5781, term5781.getClass(), "negativeSuffix", "");
        setField(term5781, term5781.getClass(), "posPrefixPattern", "");
        setField(term5781, term5781.getClass(), "posSuffixPattern", "");
        setField(term5781, term5781.getClass(), "negPrefixPattern", "\'-");
        setField(term5781, term5781.getClass(), "negSuffixPattern", "");
        setIntField(term5781, term5781.getClass(), "multiplier", 1);
        setByteField(term5781, term5781.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term5781, term5781.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term5781, term5781.getClass(), "parseBigDecimal", false);
        setBooleanField(term5781, term5781.getClass(), "isCurrencyFormat", false);
        setCharField(term5834, term5834.getClass(), "zeroDigit", (char) 48);
        setCharField(term5834, term5834.getClass(), "groupingSeparator", (char) 44);
        setCharField(term5834, term5834.getClass(), "decimalSeparator", (char) 46);
        setCharField(term5834, term5834.getClass(), "perMill", (char) 8240);
        setCharField(term5834, term5834.getClass(), "percent", (char) 37);
        setCharField(term5834, term5834.getClass(), "digit", (char) 35);
        setCharField(term5834, term5834.getClass(), "patternSeparator", (char) 59);
        setField(term5834, term5834.getClass(), "infinity", "\u001E\"");
        setField(term5834, term5834.getClass(), "NaN", "NaN");
        setCharField(term5834, term5834.getClass(), "minusSign", (char) 45);
        setField(term5834, term5834.getClass(), "currencySymbol", null);
        setField(term5834, term5834.getClass(), "intlCurrencySymbol", null);
        setCharField(term5834, term5834.getClass(), "monetarySeparator", (char) 46);
        setCharField(term5834, term5834.getClass(), "exponential", 'E');
        setField(term5834, term5834.getClass(), "exponentialSeparator", "E");
        setField(term5858, term5858.getClass(), "language", null);
        setField(term5858, term5858.getClass(), "script", null);
        setField(term5858, term5858.getClass(), "region", null);
        setField(term5858, term5858.getClass(), "variant", null);
        setIntField(term5858, term5858.getClass(), "hash", 96636889);
        setField(term5857, term5857.getClass(), "baseLocale", term5858);
        setField(term5857, term5857.getClass(), "localeExtensions", null);
        setIntField(term5857, term5857.getClass(), "hashCodeValue", 96636889);
        setField(term5857, term5857.getClass(), "languageTag", "");
        setField(term5834, term5834.getClass(), "locale", term5857);
        setField(term5834, term5834.getClass(), "currency", null);
        setBooleanField(term5834, term5834.getClass(), "currencyInitialized", false);
        setIntField(term5834, term5834.getClass(), "serialVersionOnStream", 3);
        setField(term5781, term5781.getClass(), "symbols", term5834);
        setBooleanField(term5781, term5781.getClass(), "useExponentialNotation", false);
        setField(term5781, term5781.getClass(), "positivePrefixFieldPositions", null);
        setField(term5781, term5781.getClass(), "positiveSuffixFieldPositions", null);
        setField(term5781, term5781.getClass(), "negativePrefixFieldPositions", null);
        setField(term5781, term5781.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term5781, term5781.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term5781, term5781.getClass(), "maximumIntegerDigits", 309);
        setIntField(term5781, term5781.getClass(), "minimumIntegerDigits", 1);
        setIntField(term5781, term5781.getClass(), "maximumFractionDigits", 2);
        setIntField(term5781, term5781.getClass(), "minimumFractionDigits", 0);
        setField(term5781, term5781.getClass(), "roundingMode", enum13);
        setBooleanField(term5781, term5781.getClass(), "isFastPath", false);
        setBooleanField(term5781, term5781.getClass(), "fastPathCheckNeeded", true);
        setField(term5781, term5781.getClass(), "fastPathData", null);
        setIntField(term5781, term5781.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term5781, term5781.getClass(), "groupingUsed", true);
        setByteField(term5781, term5781.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term5781, term5781.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term5781, term5781.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term5781, term5781.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term5781, term5781.getClass(), "parseIntegerOnly", false);
        setField(term5777, term5777.getClass(), "imaginaryFormat", term5781);
        setField(term5884, term5884.getClass(), "bigIntegerMultiplier", null);
        setField(term5884, term5884.getClass(), "bigDecimalMultiplier", null);
        setIntField(term5885, term5885.getClass(), "decimalAt", 0);
        setIntField(term5885, term5885.getClass(), "count", 0);
        setField(term5885, term5885.getClass(), "digits", term5888);
        setField(term5885, term5885.getClass(), "data", null);
        setField(term5885, term5885.getClass(), "roundingMode", enum13);
        setBooleanField(term5885, term5885.getClass(), "isNegative", false);
        setField(term5885, term5885.getClass(), "tempBuffer", null);
        setField(term5884, term5884.getClass(), "digitList", term5885);
        setField(term5884, term5884.getClass(), "positivePrefix", "");
        setField(term5884, term5884.getClass(), "positiveSuffix", "");
        setField(term5884, term5884.getClass(), "negativePrefix", "-");
        setField(term5884, term5884.getClass(), "negativeSuffix", "");
        setField(term5884, term5884.getClass(), "posPrefixPattern", "");
        setField(term5884, term5884.getClass(), "posSuffixPattern", "");
        setField(term5884, term5884.getClass(), "negPrefixPattern", "\'-");
        setField(term5884, term5884.getClass(), "negSuffixPattern", "");
        setIntField(term5884, term5884.getClass(), "multiplier", 1);
        setByteField(term5884, term5884.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term5884, term5884.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term5884, term5884.getClass(), "parseBigDecimal", false);
        setBooleanField(term5884, term5884.getClass(), "isCurrencyFormat", false);
        setCharField(term5933, term5933.getClass(), "zeroDigit", (char) 48);
        setCharField(term5933, term5933.getClass(), "groupingSeparator", (char) 44);
        setCharField(term5933, term5933.getClass(), "decimalSeparator", (char) 46);
        setCharField(term5933, term5933.getClass(), "perMill", (char) 8240);
        setCharField(term5933, term5933.getClass(), "percent", (char) 37);
        setCharField(term5933, term5933.getClass(), "digit", (char) 35);
        setCharField(term5933, term5933.getClass(), "patternSeparator", (char) 59);
        setField(term5933, term5933.getClass(), "infinity", "\u001E\"");
        setField(term5933, term5933.getClass(), "NaN", "NaN");
        setCharField(term5933, term5933.getClass(), "minusSign", (char) 45);
        setField(term5933, term5933.getClass(), "currencySymbol", null);
        setField(term5933, term5933.getClass(), "intlCurrencySymbol", null);
        setCharField(term5933, term5933.getClass(), "monetarySeparator", (char) 46);
        setCharField(term5933, term5933.getClass(), "exponential", 'E');
        setField(term5933, term5933.getClass(), "exponentialSeparator", "E");
        setField(term5933, term5933.getClass(), "locale", term5857);
        setField(term5933, term5933.getClass(), "currency", null);
        setBooleanField(term5933, term5933.getClass(), "currencyInitialized", false);
        setIntField(term5933, term5933.getClass(), "serialVersionOnStream", 3);
        setField(term5884, term5884.getClass(), "symbols", term5933);
        setBooleanField(term5884, term5884.getClass(), "useExponentialNotation", false);
        setField(term5884, term5884.getClass(), "positivePrefixFieldPositions", null);
        setField(term5884, term5884.getClass(), "positiveSuffixFieldPositions", null);
        setField(term5884, term5884.getClass(), "negativePrefixFieldPositions", null);
        setField(term5884, term5884.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term5884, term5884.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term5884, term5884.getClass(), "maximumIntegerDigits", 309);
        setIntField(term5884, term5884.getClass(), "minimumIntegerDigits", 1);
        setIntField(term5884, term5884.getClass(), "maximumFractionDigits", 2);
        setIntField(term5884, term5884.getClass(), "minimumFractionDigits", 0);
        setField(term5884, term5884.getClass(), "roundingMode", enum13);
        setBooleanField(term5884, term5884.getClass(), "isFastPath", false);
        setBooleanField(term5884, term5884.getClass(), "fastPathCheckNeeded", true);
        setField(term5884, term5884.getClass(), "fastPathData", null);
        setIntField(term5884, term5884.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term5884, term5884.getClass(), "groupingUsed", true);
        setByteField(term5884, term5884.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term5884, term5884.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term5884, term5884.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term5884, term5884.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term5884, term5884.getClass(), "parseIntegerOnly", false);
        setField(term5777, term5777.getClass(), "realFormat", term5884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZiaGIbnzTs";
        callMethod(klass, "setImaginaryCharacter", argTypes, term5777, args);
    }

};


