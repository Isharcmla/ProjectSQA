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
     Object term576;

    public Parser_processArgs_36922360720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term629 = new ArrayList();
        term576 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term628 = newInstance(Class.forName("java.lang.Object"));
        setField(term576, term576.getClass(), "opt", "HyxfbSQYBe");
        setField(term576, term576.getClass(), "longOpt", "pCTimMblYc");
        setField(term576, term576.getClass(), "argName", "hNxWaHcfhY");
        setField(term576, term576.getClass(), "description", "RkybSrpybU");
        setBooleanField(term576, term576.getClass(), "required", false);
        setBooleanField(term576, term576.getClass(), "optionalArg", false);
        setIntField(term576, term576.getClass(), "numberOfArgs", 568599855);
        setField(term576, term576.getClass(), "type", term628);
        setField(term576, term576.getClass(), "values", term629);
        setCharField(term576, term576.getClass(), "valuesep", 'P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        argTypes[1] = Class.forName("java.util.ListIterator");
        Object[] args = new Object[2];
        args[0] = term576;
        args[1] = null;
        try {
            callMethod(klass, "processArgs", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


