package org.apache.commons.cli;

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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Option_getType_6641811150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453;
     Object term5539;
     Object term5481;

    public Option_getType_6641811150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term506 = new ArrayList();
        term453 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term505 = newInstance(Class.forName("java.lang.Object"));
        setField(term453, term453.getClass(), "opt", "pCTimMblYc");
        setField(term453, term453.getClass(), "longOpt", "hNxWaHcfhY");
        setField(term453, term453.getClass(), "argName", "RkybSrpybU");
        setField(term453, term453.getClass(), "description", "xOEqzGAmDU");
        setBooleanField(term453, term453.getClass(), "required", false);
        setBooleanField(term453, term453.getClass(), "optionalArg", true);
        setIntField(term453, term453.getClass(), "numberOfArgs", 391863371);
        setField(term453, term453.getClass(), "type", term505);
        setField(term453, term453.getClass(), "values", term506);
        setCharField(term453, term453.getClass(), "valuesep", 'B');
        ArrayList term5549 = new ArrayList();
        term5539 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term5548 = newInstance(Class.forName("java.lang.Object"));
        setField(term5539, term5539.getClass(), "opt", "pCTimMblYc");
        setField(term5539, term5539.getClass(), "longOpt", "hNxWaHcfhY");
        setField(term5539, term5539.getClass(), "argName", "RkybSrpybU");
        setField(term5539, term5539.getClass(), "description", "xOEqzGAmDU");
        setBooleanField(term5539, term5539.getClass(), "required", false);
        setBooleanField(term5539, term5539.getClass(), "optionalArg", true);
        setIntField(term5539, term5539.getClass(), "numberOfArgs", 391863371);
        setField(term5539, term5539.getClass(), "type", term5548);
        setField(term5539, term5539.getClass(), "values", term5549);
        setCharField(term5539, term5539.getClass(), "valuesep", 'B');
        term5481 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getType", argTypes, term453, args);
        assertTrue(recursiveEquals(term453, term5539));
        assertTrue(recursiveEquals(retValue, term5481));
    }

};


