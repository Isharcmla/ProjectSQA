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
import java.util.ArrayList;

public class Option_getType_6641811150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450;
     Object term5460;

    public Option_getType_6641811150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term502 = new ArrayList();
        term450 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term450, term450.getClass(), "opt", "pCTimMblYc");
        setField(term450, term450.getClass(), "longOpt", "hNxWaHcfhY");
        setField(term450, term450.getClass(), "argName", "RkybSrpybU");
        setField(term450, term450.getClass(), "description", "xOEqzGAmDU");
        setBooleanField(term450, term450.getClass(), "required", false);
        setBooleanField(term450, term450.getClass(), "optionalArg", true);
        setIntField(term450, term450.getClass(), "numberOfArgs", 391863371);
        setField(term450, term450.getClass(), "type", null);
        setField(term450, term450.getClass(), "values", term502);
        setCharField(term450, term450.getClass(), "valuesep", 'B');
        ArrayList term5469 = new ArrayList();
        term5460 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term5460, term5460.getClass(), "opt", "pCTimMblYc");
        setField(term5460, term5460.getClass(), "longOpt", "hNxWaHcfhY");
        setField(term5460, term5460.getClass(), "argName", "RkybSrpybU");
        setField(term5460, term5460.getClass(), "description", "xOEqzGAmDU");
        setBooleanField(term5460, term5460.getClass(), "required", false);
        setBooleanField(term5460, term5460.getClass(), "optionalArg", true);
        setIntField(term5460, term5460.getClass(), "numberOfArgs", 391863371);
        setField(term5460, term5460.getClass(), "type", null);
        setField(term5460, term5460.getClass(), "values", term5469);
        setCharField(term5460, term5460.getClass(), "valuesep", 'B');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getType", argTypes, term450, args);
        assertTrue(recursiveEquals(term450, term5460));
        assertTrue(recursiveEquals(retValue, null));
    }

};


