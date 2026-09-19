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
import java.util.LinkedList;
import java.util.HashMap;
import java.lang.Object;

public class CommandLine_getOptions_38840034133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571;
     Object term1614;
     Object term1593;

    public CommandLine_getOptions_38840034133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term572 = new LinkedList();
        HashMap term575 = new HashMap();
        HashMap term580 = new HashMap();
        HashMap term585 = new HashMap();
        term571 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term571, term571.getClass(), "args", term572);
        setField(term571, term571.getClass(), "options", term575);
        setField(term571, term571.getClass(), "names", term580);
        setField(term571, term571.getClass(), "hashcodeMap", term585);
        LinkedList term1615 = new LinkedList();
        HashMap term1616 = new HashMap();
        HashMap term1618 = new HashMap();
        HashMap term1619 = new HashMap();
        term1614 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1614, term1614.getClass(), "args", term1615);
        setField(term1614, term1614.getClass(), "options", term1616);
        setField(term1614, term1614.getClass(), "names", term1618);
        setField(term1614, term1614.getClass(), "hashcodeMap", term1619);
        term1593 = (Object[]) newArray("org.apache.commons.cli.Option", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptions", argTypes, term571, args);
        assertTrue(recursiveEquals(term571, term1614));
        assertTrue(recursiveEquals(retValue, term1593));
    }

};


