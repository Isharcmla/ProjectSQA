package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Object;

public class StringUtils_stripAll_1527365358164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265;
     Object term7346;
     Object term7285;

    public StringUtils_stripAll_1527365358164() {
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
        term7346 = (Object[]) newArray("java.lang.String", 5);
        setElement(term7346, 0, "MxlszYVzRf");
        setElement(term7346, 1, "LQFpaHEwXR");
        setElement(term7346, 2, "oVcInYnLWB");
        setElement(term7346, 3, "aJlieCFVtF");
        setElement(term7346, 4, "ZiaGIbnzTs");
        term7285 = (Object[]) newArray("java.lang.String", 5);
        setElement(term7285, 0, "MxlszYVzRf");
        setElement(term7285, 1, "LQFpaHEwXR");
        setElement(term7285, 2, "oVcInYnLWB");
        setElement(term7285, 3, "aJlieCFVtF");
        setElement(term7285, 4, "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term265;
        Object retValue = callMethod(klass, "stripAll", argTypes, null, args);
        assertTrue(recursiveEquals(term265, term7346));
        assertTrue(recursiveEquals(retValue, term7285));
    }

};


