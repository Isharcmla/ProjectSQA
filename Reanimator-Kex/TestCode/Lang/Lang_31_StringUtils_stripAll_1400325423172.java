package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;

public class StringUtils_stripAll_1400325423172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265;
     Object term7004;
     Object term6943;

    public StringUtils_stripAll_1400325423172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265 = (Object[]) newArray("java.lang.String", 5);
        setElement(term265, 0, "MxlszYVzRf");
        setElement(term265, 1, "LQFpaHEwXR");
        setElement(term265, 2, "oVcInYnLWB");
        setElement(term265, 3, "aJlieCFVtF");
        setElement(term265, 4, "ZiaGIbnzTs");
        term7004 = (Object[]) newArray("java.lang.String", 5);
        setElement(term7004, 0, "MxlszYVzRf");
        setElement(term7004, 1, "LQFpaHEwXR");
        setElement(term7004, 2, "oVcInYnLWB");
        setElement(term7004, 3, "aJlieCFVtF");
        setElement(term7004, 4, "ZiaGIbnzTs");
        term6943 = (Object[]) newArray("java.lang.String", 5);
        setElement(term6943, 0, "MxlszYVzRf");
        setElement(term6943, 1, "LQFpaHEwXR");
        setElement(term6943, 2, "oVcInYnLWB");
        setElement(term6943, 3, "aJlieCFVtF");
        setElement(term6943, 4, "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term265;
        Object retValue = callMethod(klass, "stripAll", argTypes, null, args);
        assertTrue(recursiveEquals(term265, term7004));
        assertTrue(recursiveEquals(retValue, term6943));
    }

};


