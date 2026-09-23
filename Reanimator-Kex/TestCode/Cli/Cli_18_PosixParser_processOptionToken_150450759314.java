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

public class PosixParser_processOptionToken_150450759314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term870;
     Object term998;
     Object term2434;

    public PosixParser_processOptionToken_150450759314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term871 = new ArrayList();
        ArrayList term929 = new ArrayList();
        HashMap term963 = new HashMap();
        HashMap term968 = new HashMap();
        ArrayList term973 = new ArrayList();
        HashMap term977 = new HashMap();
        LinkedList term955 = new LinkedList();
        ArrayList term958 = new ArrayList();
        ArrayList term982 = new ArrayList();
        term870 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term876 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term928 = newInstance(Class.forName("java.lang.Object"));
        Object term962 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term954 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term870, term870.getClass(), "tokens", term871);
        setBooleanField(term870, term870.getClass(), "eatTheRest", true);
        setField(term876, term876.getClass(), "opt", "eZFUvlxvGV");
        setField(term876, term876.getClass(), "longOpt", "BYqFIqCKAV");
        setField(term876, term876.getClass(), "argName", "vrQLuWIDJX");
        setField(term876, term876.getClass(), "description", "flxyYxBRtu");
        setBooleanField(term876, term876.getClass(), "required", true);
        setBooleanField(term876, term876.getClass(), "optionalArg", false);
        setIntField(term876, term876.getClass(), "numberOfArgs", -616727354);
        setField(term876, term876.getClass(), "type", term928);
        setField(term876, term876.getClass(), "values", term929);
        setCharField(term876, term876.getClass(), "valuesep", 'n');
        setField(term870, term870.getClass(), "currentOption", term876);
        setField(term962, term962.getClass(), "shortOpts", term963);
        setField(term962, term962.getClass(), "longOpts", term968);
        setField(term962, term962.getClass(), "requiredOpts", term973);
        setField(term962, term962.getClass(), "optionGroups", term977);
        setField(term870, term870.getClass(), "options", term962);
        setField(term954, term954.getClass(), "args", term955);
        setField(term954, term954.getClass(), "options", term958);
        setField(term870, term870.getClass(), "cmd", term954);
        setField(term870, term870.getClass(), "requiredOptions", term982);
        term998 = new Boolean(false);
        ArrayList term2435 = new ArrayList();
        ArrayList term2447 = new ArrayList();
        LinkedList term2450 = new LinkedList();
        ArrayList term2451 = new ArrayList();
        ArrayList term2453 = new ArrayList();
        term2434 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term2437 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2446 = newInstance(Class.forName("java.lang.Object"));
        Object term2449 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term2434, term2434.getClass(), "tokens", term2435);
        setBooleanField(term2434, term2434.getClass(), "eatTheRest", true);
        setField(term2437, term2437.getClass(), "opt", "eZFUvlxvGV");
        setField(term2437, term2437.getClass(), "longOpt", "BYqFIqCKAV");
        setField(term2437, term2437.getClass(), "argName", "vrQLuWIDJX");
        setField(term2437, term2437.getClass(), "description", "flxyYxBRtu");
        setBooleanField(term2437, term2437.getClass(), "required", true);
        setBooleanField(term2437, term2437.getClass(), "optionalArg", false);
        setIntField(term2437, term2437.getClass(), "numberOfArgs", -616727354);
        setField(term2437, term2437.getClass(), "type", term2446);
        setField(term2437, term2437.getClass(), "values", term2447);
        setCharField(term2437, term2437.getClass(), "valuesep", 'n');
        setField(term2434, term2434.getClass(), "currentOption", term2437);
        setField(term2434, term2434.getClass(), "options", null);
        setField(term2449, term2449.getClass(), "args", term2450);
        setField(term2449, term2449.getClass(), "options", term2451);
        setField(term2434, term2434.getClass(), "cmd", term2449);
        setField(term2434, term2434.getClass(), "requiredOptions", term2453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "OclPbYPkcH";
        args[1] = term998;
        callMethod(klass, "processOptionToken", argTypes, term870, args);
        assertTrue(recursiveEquals(term870, term2434));
        assertTrue(recursiveEquals(term998, false));
    }

};


