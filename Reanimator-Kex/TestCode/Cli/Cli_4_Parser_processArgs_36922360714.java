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
import java.lang.NullPointerException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Parser_processArgs_36922360714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term556;

    public Parser_processArgs_36922360714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term610 = new ArrayList();
        term556 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term609 = newInstance(Class.forName("java.lang.Object"));
        setField(term556, term556.getClass(), "opt", "HyxfbSQYBe");
        setField(term556, term556.getClass(), "longOpt", "pCTimMblYc");
        setBooleanField(term556, term556.getClass(), "hasArg", false);
        setField(term556, term556.getClass(), "argName", "hNxWaHcfhY");
        setField(term556, term556.getClass(), "description", "RkybSrpybU");
        setBooleanField(term556, term556.getClass(), "required", false);
        setBooleanField(term556, term556.getClass(), "optionalArg", true);
        setIntField(term556, term556.getClass(), "numberOfArgs", 568599855);
        setField(term556, term556.getClass(), "type", term609);
        setField(term556, term556.getClass(), "values", term610);
        setCharField(term556, term556.getClass(), "valuesep", 'P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        argTypes[1] = Class.forName("java.util.ListIterator");
        Object[] args = new Object[2];
        args[0] = term556;
        args[1] = null;
        try {
            callMethod(klass, "processArgs", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


