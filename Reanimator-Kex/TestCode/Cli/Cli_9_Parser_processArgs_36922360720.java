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

public class Parser_processArgs_36922360720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578;

    public Parser_processArgs_36922360720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term631 = new ArrayList();
        term578 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term630 = newInstance(Class.forName("java.lang.Object"));
        setField(term578, term578.getClass(), "opt", "HyxfbSQYBe");
        setField(term578, term578.getClass(), "longOpt", "pCTimMblYc");
        setField(term578, term578.getClass(), "argName", "hNxWaHcfhY");
        setField(term578, term578.getClass(), "description", "RkybSrpybU");
        setBooleanField(term578, term578.getClass(), "required", false);
        setBooleanField(term578, term578.getClass(), "optionalArg", false);
        setIntField(term578, term578.getClass(), "numberOfArgs", 568599855);
        setField(term578, term578.getClass(), "type", term630);
        setField(term578, term578.getClass(), "values", term631);
        setCharField(term578, term578.getClass(), "valuesep", 'P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        argTypes[1] = Class.forName("java.util.ListIterator");
        Object[] args = new Object[2];
        args[0] = term578;
        args[1] = null;
        try {
            callMethod(klass, "processArgs", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


