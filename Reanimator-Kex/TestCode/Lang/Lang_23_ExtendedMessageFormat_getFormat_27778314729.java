package org.apache.commons.lang3.text;

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
import static org.apache.commons.lang3.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.text.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class ExtendedMessageFormat_getFormat_27778314729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term821;
     Object term4222;

    public ExtendedMessageFormat_getFormat_27778314729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term834 = new HashMap();
        term821 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term839 = newInstance(Class.forName("java.util.Locale"));
        Object term840 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term871 = (Object[]) newArray("java.text.Format", 1);
        int[] term872 = (int[]) newIntArray(9);
        int[] term882 = (int[]) newIntArray(3);
        setField(term821, term821.getClass(), "toPattern", "IoAlmYsBwc");
        setField(term821, term821.getClass(), "registry", term834);
        setField(term840, term840.getClass(), "language", "pa");
        setField(term840, term840.getClass(), "script", "Arab");
        setField(term840, term840.getClass(), "region", "PK");
        setField(term840, term840.getClass(), "variant", "");
        setIntField(term840, term840.getClass(), "hash", 2075563398);
        setField(term839, term839.getClass(), "baseLocale", term840);
        setField(term839, term839.getClass(), "localeExtensions", null);
        setIntField(term839, term839.getClass(), "hashCodeValue", 2075563398);
        setField(term839, term839.getClass(), "languageTag", null);
        setField(term821, term821.getClass(), "locale", term839);
        setField(term821, term821.getClass(), "pattern", "TEParAifyi");
        setField(term821, term821.getClass(), "formats", term871);
        setIntElement(term872, 0, 1063420942);
        setIntElement(term872, 1, 1375330971);
        setIntElement(term872, 2, -478195677);
        setIntElement(term872, 3, 972867650);
        setIntElement(term872, 4, 1655935355);
        setIntElement(term872, 5, -481533957);
        setIntElement(term872, 6, 1240914516);
        setIntElement(term872, 7, -1465035361);
        setIntElement(term872, 8, 1090617576);
        setField(term821, term821.getClass(), "offsets", term872);
        setIntElement(term882, 0, -1547384488);
        setIntElement(term882, 1, 1442160736);
        setIntElement(term882, 2, 1114000454);
        setField(term821, term821.getClass(), "argumentNumbers", term882);
        setIntField(term821, term821.getClass(), "maxOffset", -556405712);
        HashMap term4225 = new HashMap();
        term4222 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term4226 = newInstance(Class.forName("java.util.Locale"));
        Object term4227 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term4238 = (Object[]) newArray("java.text.Format", 1);
        int[] term4239 = (int[]) newIntArray(9);
        int[] term4240 = (int[]) newIntArray(3);
        setField(term4222, term4222.getClass(), "toPattern", "IoAlmYsBwc");
        setField(term4222, term4222.getClass(), "registry", term4225);
        setField(term4227, term4227.getClass(), "language", "pa");
        setField(term4227, term4227.getClass(), "script", "Arab");
        setField(term4227, term4227.getClass(), "region", "PK");
        setField(term4227, term4227.getClass(), "variant", "");
        setIntField(term4227, term4227.getClass(), "hash", 2075563398);
        setField(term4226, term4226.getClass(), "baseLocale", term4227);
        setField(term4226, term4226.getClass(), "localeExtensions", null);
        setIntField(term4226, term4226.getClass(), "hashCodeValue", 2075563398);
        setField(term4226, term4226.getClass(), "languageTag", null);
        setField(term4222, term4222.getClass(), "locale", term4226);
        setField(term4222, term4222.getClass(), "pattern", "TEParAifyi");
        setField(term4222, term4222.getClass(), "formats", term4238);
        setIntElement(term4239, 0, 1063420942);
        setIntElement(term4239, 1, 1375330971);
        setIntElement(term4239, 2, -478195677);
        setIntElement(term4239, 3, 972867650);
        setIntElement(term4239, 4, 1655935355);
        setIntElement(term4239, 5, -481533957);
        setIntElement(term4239, 6, 1240914516);
        setIntElement(term4239, 7, -1465035361);
        setIntElement(term4239, 8, 1090617576);
        setField(term4222, term4222.getClass(), "offsets", term4239);
        setIntElement(term4240, 0, -1547384488);
        setIntElement(term4240, 1, 1442160736);
        setIntElement(term4240, 2, 1114000454);
        setField(term4222, term4222.getClass(), "argumentNumbers", term4240);
        setIntField(term4222, term4222.getClass(), "maxOffset", -556405712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OWDIEULEFu";
        Object retValue = callMethod(klass, "getFormat", argTypes, term821, args);
        assertTrue(recursiveEquals(term821, term4222));
        assertTrue(recursiveEquals(retValue, null));
    }

};


