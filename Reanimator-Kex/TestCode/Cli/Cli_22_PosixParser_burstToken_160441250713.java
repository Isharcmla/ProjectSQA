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
import java.lang.Boolean;

public class PosixParser_burstToken_160441250713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426;
     Object term496;
     Object term1224;

    public PosixParser_burstToken_160441250713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term427 = new ArrayList();
        HashMap term461 = new HashMap();
        HashMap term466 = new HashMap();
        ArrayList term471 = new ArrayList();
        HashMap term475 = new HashMap();
        LinkedList term453 = new LinkedList();
        ArrayList term456 = new ArrayList();
        ArrayList term480 = new ArrayList();
        term426 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term460 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term452 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term426, term426.getClass(), "tokens", term427);
        setBooleanField(term426, term426.getClass(), "eatTheRest", true);
        setField(term460, term460.getClass(), "shortOpts", term461);
        setField(term460, term460.getClass(), "longOpts", term466);
        setField(term460, term460.getClass(), "requiredOpts", term471);
        setField(term460, term460.getClass(), "optionGroups", term475);
        setField(term426, term426.getClass(), "options", term460);
        setField(term452, term452.getClass(), "args", term453);
        setField(term452, term452.getClass(), "options", term456);
        setField(term426, term426.getClass(), "cmd", term452);
        setField(term426, term426.getClass(), "requiredOptions", term480);
        term496 = new Boolean(false);
        ArrayList term1225 = new ArrayList();
        ((ArrayList) term1225).add("EGtDIRbSSb");
        LinkedList term1230 = new LinkedList();
        ArrayList term1231 = new ArrayList();
        ArrayList term1233 = new ArrayList();
        term1224 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term1229 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1224, term1224.getClass(), "tokens", term1225);
        setBooleanField(term1224, term1224.getClass(), "eatTheRest", true);
        setField(term1224, term1224.getClass(), "options", null);
        setField(term1229, term1229.getClass(), "args", term1230);
        setField(term1229, term1229.getClass(), "options", term1231);
        setField(term1224, term1224.getClass(), "cmd", term1229);
        setField(term1224, term1224.getClass(), "requiredOptions", term1233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "EGtDIRbSSb";
        args[1] = term496;
        callMethod(klass, "burstToken", argTypes, term426, args);
        assertTrue(recursiveEquals(term426, term1224));
        assertTrue(recursiveEquals(term496, false));
    }

};


