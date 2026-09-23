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
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedList;

public class PosixParser_gobble_93728277010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206;
     Object term918;

    public PosixParser_gobble_93728277010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term207 = new ArrayList();
        HashMap term241 = new HashMap();
        HashMap term246 = new HashMap();
        ArrayList term251 = new ArrayList();
        HashMap term255 = new HashMap();
        LinkedList term233 = new LinkedList();
        ArrayList term236 = new ArrayList();
        ArrayList term260 = new ArrayList();
        term206 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term240 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term232 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term206, term206.getClass(), "tokens", term207);
        setBooleanField(term206, term206.getClass(), "eatTheRest", false);
        setField(term240, term240.getClass(), "shortOpts", term241);
        setField(term240, term240.getClass(), "longOpts", term246);
        setField(term240, term240.getClass(), "requiredOpts", term251);
        setField(term240, term240.getClass(), "optionGroups", term255);
        setField(term206, term206.getClass(), "options", term240);
        setField(term232, term232.getClass(), "args", term233);
        setField(term232, term232.getClass(), "options", term236);
        setField(term206, term206.getClass(), "cmd", term232);
        setField(term206, term206.getClass(), "requiredOptions", term260);
        ArrayList term919 = new ArrayList();
        LinkedList term922 = new LinkedList();
        ArrayList term923 = new ArrayList();
        ArrayList term925 = new ArrayList();
        term918 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term921 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term918, term918.getClass(), "tokens", term919);
        setBooleanField(term918, term918.getClass(), "eatTheRest", false);
        setField(term918, term918.getClass(), "options", null);
        setField(term921, term921.getClass(), "args", term922);
        setField(term921, term921.getClass(), "options", term923);
        setField(term918, term918.getClass(), "cmd", term921);
        setField(term918, term918.getClass(), "requiredOptions", term925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "gobble", argTypes, term206, args);
        assertTrue(recursiveEquals(term206, term918));
    }

};


