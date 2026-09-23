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

public class StringUtils_stripAll_1400325423165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265;
     Object term7388;
     Object term7327;

    public StringUtils_stripAll_1400325423165() {
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
        term7388 = (Object[]) newArray("java.lang.String", 5);
        setElement(term7388, 0, "MxlszYVzRf");
        setElement(term7388, 1, "LQFpaHEwXR");
        setElement(term7388, 2, "oVcInYnLWB");
        setElement(term7388, 3, "aJlieCFVtF");
        setElement(term7388, 4, "ZiaGIbnzTs");
        term7327 = (Object[]) newArray("java.lang.String", 5);
        setElement(term7327, 0, "MxlszYVzRf");
        setElement(term7327, 1, "LQFpaHEwXR");
        setElement(term7327, 2, "oVcInYnLWB");
        setElement(term7327, 3, "aJlieCFVtF");
        setElement(term7327, 4, "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term265;
        Object retValue = callMethod(klass, "stripAll", argTypes, null, args);
        assertTrue(recursiveEquals(term265, term7388));
        assertTrue(recursiveEquals(retValue, term7327));
    }

};


