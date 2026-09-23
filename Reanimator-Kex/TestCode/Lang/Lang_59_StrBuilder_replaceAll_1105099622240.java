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

public class StrBuilder_replaceAll_1105099622240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8336;
     Object term76235;
     Object term76041;

    public StrBuilder_replaceAll_1105099622240() {
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
        term76235 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term76236 = (char[]) newCharArray(32);
        setField(term76235, term76235.getClass(), "buffer", term76236);
        setIntField(term76235, term76235.getClass(), "size", 1474524152);
        setField(term76235, term76235.getClass(), "newLine", "HWkpTmtlrc");
        setField(term76235, term76235.getClass(), "nullText", "hMmaoREuCK");
        term76041 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term76042 = (char[]) newCharArray(32);
        setField(term76041, term76041.getClass(), "buffer", term76042);
        setIntField(term76041, term76041.getClass(), "size", 1474524152);
        setField(term76041, term76041.getClass(), "newLine", "HWkpTmtlrc");
        setField(term76041, term76041.getClass(), "nullText", "hMmaoREuCK");
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
        assertTrue(recursiveEquals(term8336, term76235));
        assertTrue(recursiveEquals(retValue, term76041));
    }

};


