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

public class StrBuilder_getNullText_955014426115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269;
     Object term33955;

    public StrBuilder_getNullText_955014426115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term270 = (char[]) newCharArray(32);
        setField(term269, term269.getClass(), "buffer", term270);
        setIntField(term269, term269.getClass(), "size", 391863371);
        setField(term269, term269.getClass(), "newLine", "SzjVpOQTyS");
        setField(term269, term269.getClass(), "nullText", "MjGYSRKTNF");
        term33955 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term33956 = (char[]) newCharArray(32);
        setField(term33955, term33955.getClass(), "buffer", term33956);
        setIntField(term33955, term33955.getClass(), "size", 391863371);
        setField(term33955, term33955.getClass(), "newLine", "SzjVpOQTyS");
        setField(term33955, term33955.getClass(), "nullText", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNullText", argTypes, term269, args);
        assertTrue(recursiveEquals(term269, term33955));
        assertTrue(recursiveEquals(retValue, "MjGYSRKTNF"));
    }

};


