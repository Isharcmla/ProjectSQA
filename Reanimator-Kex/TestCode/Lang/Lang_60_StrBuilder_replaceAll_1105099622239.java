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
     Object term74601;
     Object term74407;

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
        term74601 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term74602 = (char[]) newCharArray(32);
        setField(term74601, term74601.getClass(), "buffer", term74602);
        setIntField(term74601, term74601.getClass(), "size", 1474524152);
        setField(term74601, term74601.getClass(), "newLine", "HWkpTmtlrc");
        setField(term74601, term74601.getClass(), "nullText", "hMmaoREuCK");
        term74407 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term74408 = (char[]) newCharArray(32);
        setField(term74407, term74407.getClass(), "buffer", term74408);
        setIntField(term74407, term74407.getClass(), "size", 1474524152);
        setField(term74407, term74407.getClass(), "newLine", "HWkpTmtlrc");
        setField(term74407, term74407.getClass(), "nullText", "hMmaoREuCK");
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
        assertTrue(recursiveEquals(term8336, term74601));
        assertTrue(recursiveEquals(retValue, term74407));
    }

};


