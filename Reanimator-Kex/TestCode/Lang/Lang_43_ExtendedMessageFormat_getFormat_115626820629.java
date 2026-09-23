package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class ExtendedMessageFormat_getFormat_115626820629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term753;
     Object term4194;

    public ExtendedMessageFormat_getFormat_115626820629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term766 = new HashMap();
        term753 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term771 = newInstance(Class.forName("java.util.Locale"));
        Object term772 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term803 = (Object[]) newArray("java.text.Format", 1);
        int[] term804 = (int[]) newIntArray(9);
        int[] term814 = (int[]) newIntArray(3);
        setField(term753, term753.getClass(), "toPattern", "tbcdzjIfER");
        setField(term753, term753.getClass(), "registry", term766);
        setField(term772, term772.getClass(), "language", "pa");
        setField(term772, term772.getClass(), "script", "Arab");
        setField(term772, term772.getClass(), "region", "PK");
        setField(term772, term772.getClass(), "variant", "");
        setIntField(term772, term772.getClass(), "hash", 2075563398);
        setField(term771, term771.getClass(), "baseLocale", term772);
        setField(term771, term771.getClass(), "localeExtensions", null);
        setIntField(term771, term771.getClass(), "hashCodeValue", 2075563398);
        setField(term771, term771.getClass(), "languageTag", null);
        setField(term753, term753.getClass(), "locale", term771);
        setField(term753, term753.getClass(), "pattern", "HyxfbSQYBe");
        setField(term753, term753.getClass(), "formats", term803);
        setIntElement(term804, 0, 1063420942);
        setIntElement(term804, 1, 1375330971);
        setIntElement(term804, 2, -478195677);
        setIntElement(term804, 3, 972867650);
        setIntElement(term804, 4, 1655935355);
        setIntElement(term804, 5, -481533957);
        setIntElement(term804, 6, 1240914516);
        setIntElement(term804, 7, -1465035361);
        setIntElement(term804, 8, 1090617576);
        setField(term753, term753.getClass(), "offsets", term804);
        setIntElement(term814, 0, -1547384488);
        setIntElement(term814, 1, 1442160736);
        setIntElement(term814, 2, 1114000454);
        setField(term753, term753.getClass(), "argumentNumbers", term814);
        setIntField(term753, term753.getClass(), "maxOffset", -556405712);
        HashMap term4197 = new HashMap();
        term4194 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term4198 = newInstance(Class.forName("java.util.Locale"));
        Object term4199 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term4210 = (Object[]) newArray("java.text.Format", 1);
        int[] term4211 = (int[]) newIntArray(9);
        int[] term4212 = (int[]) newIntArray(3);
        setField(term4194, term4194.getClass(), "toPattern", "tbcdzjIfER");
        setField(term4194, term4194.getClass(), "registry", term4197);
        setField(term4199, term4199.getClass(), "language", "pa");
        setField(term4199, term4199.getClass(), "script", "Arab");
        setField(term4199, term4199.getClass(), "region", "PK");
        setField(term4199, term4199.getClass(), "variant", "");
        setIntField(term4199, term4199.getClass(), "hash", 2075563398);
        setField(term4198, term4198.getClass(), "baseLocale", term4199);
        setField(term4198, term4198.getClass(), "localeExtensions", null);
        setIntField(term4198, term4198.getClass(), "hashCodeValue", 2075563398);
        setField(term4198, term4198.getClass(), "languageTag", null);
        setField(term4194, term4194.getClass(), "locale", term4198);
        setField(term4194, term4194.getClass(), "pattern", "HyxfbSQYBe");
        setField(term4194, term4194.getClass(), "formats", term4210);
        setIntElement(term4211, 0, 1063420942);
        setIntElement(term4211, 1, 1375330971);
        setIntElement(term4211, 2, -478195677);
        setIntElement(term4211, 3, 972867650);
        setIntElement(term4211, 4, 1655935355);
        setIntElement(term4211, 5, -481533957);
        setIntElement(term4211, 6, 1240914516);
        setIntElement(term4211, 7, -1465035361);
        setIntElement(term4211, 8, 1090617576);
        setField(term4194, term4194.getClass(), "offsets", term4211);
        setIntElement(term4212, 0, -1547384488);
        setIntElement(term4212, 1, 1442160736);
        setIntElement(term4212, 2, 1114000454);
        setField(term4194, term4194.getClass(), "argumentNumbers", term4212);
        setIntField(term4194, term4194.getClass(), "maxOffset", -556405712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pCTimMblYc";
        Object retValue = callMethod(klass, "getFormat", argTypes, term753, args);
        assertTrue(recursiveEquals(term753, term4194));
        assertTrue(recursiveEquals(retValue, null));
    }

};


