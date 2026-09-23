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

public class StrBuilder_replaceAll_1105099622239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8336;
     Object term74053;
     Object term73859;

    public StrBuilder_replaceAll_1105099622239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8336 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term8337 = (char[]) newCharArray(32);
        setField(term8336, term8336.getClass(), "buffer", term8337);
        setIntField(term8336, term8336.getClass(), "size", 1474524152);
        setField(term8336, term8336.getClass(), "newLine", "HWkpTmtlrc");
        setField(term8336, term8336.getClass(), "nullText", "hMmaoREuCK");
        term74053 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term74054 = (char[]) newCharArray(32);
        setField(term74053, term74053.getClass(), "buffer", term74054);
        setIntField(term74053, term74053.getClass(), "size", 1474524152);
        setField(term74053, term74053.getClass(), "newLine", "HWkpTmtlrc");
        setField(term74053, term74053.getClass(), "nullText", "hMmaoREuCK");
        term73859 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term73860 = (char[]) newCharArray(32);
        setField(term73859, term73859.getClass(), "buffer", term73860);
        setIntField(term73859, term73859.getClass(), "size", 1474524152);
        setField(term73859, term73859.getClass(), "newLine", "HWkpTmtlrc");
        setField(term73859, term73859.getClass(), "nullText", "hMmaoREuCK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "VeDtgDzGAN";
        Object retValue = callMethod(klass, "replaceAll", argTypes, term8336, args);
        assertTrue(recursiveEquals(term8336, term74053));
        assertTrue(recursiveEquals(retValue, term73859));
    }

};


