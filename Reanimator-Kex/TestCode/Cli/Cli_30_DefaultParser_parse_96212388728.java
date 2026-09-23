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
import java.lang.IllegalArgumentException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Boolean;

public class DefaultParser_parse_96212388728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term953;
     Object term1058;
     Object term1078;
     Object term1079;
     Object term1113;

    public DefaultParser_parse_96212388728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term955 = new LinkedList();
        ArrayList term958 = new ArrayList();
        HashMap term963 = new HashMap();
        HashMap term968 = new HashMap();
        ArrayList term973 = new ArrayList();
        HashMap term977 = new HashMap();
        ArrayList term1048 = new ArrayList();
        ArrayList term1054 = new ArrayList();
        term953 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term954 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term962 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term995 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1047 = newInstance(Class.forName("java.lang.Object"));
        setField(term954, term954.getClass(), "args", term955);
        setField(term954, term954.getClass(), "options", term958);
        setField(term953, term953.getClass(), "cmd", term954);
        setField(term962, term962.getClass(), "shortOpts", term963);
        setField(term962, term962.getClass(), "longOpts", term968);
        setField(term962, term962.getClass(), "requiredOpts", term973);
        setField(term962, term962.getClass(), "optionGroups", term977);
        setField(term953, term953.getClass(), "options", term962);
        setBooleanField(term953, term953.getClass(), "stopAtNonOption", true);
        setField(term953, term953.getClass(), "currentToken", "SbAoxhfrkn");
        setField(term995, term995.getClass(), "opt", "kuTXqwMtDB");
        setField(term995, term995.getClass(), "longOpt", "Ghbwtircqb");
        setField(term995, term995.getClass(), "argName", "xrwlQZdwCp");
        setField(term995, term995.getClass(), "description", "IDCWpPLRkE");
        setBooleanField(term995, term995.getClass(), "required", false);
        setBooleanField(term995, term995.getClass(), "optionalArg", false);
        setIntField(term995, term995.getClass(), "numberOfArgs", 391863371);
        setField(term995, term995.getClass(), "type", term1047);
        setField(term995, term995.getClass(), "values", term1048);
        setCharField(term995, term995.getClass(), "valuesep", 'B');
        setField(term953, term953.getClass(), "currentOption", term995);
        setBooleanField(term953, term953.getClass(), "skipParsing", true);
        setField(term953, term953.getClass(), "expectedOpts", term1054);
        HashMap term1059 = new HashMap();
        HashMap term1064 = new HashMap();
        ArrayList term1069 = new ArrayList();
        HashMap term1073 = new HashMap();
        term1058 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1058, term1058.getClass(), "shortOpts", term1059);
        setField(term1058, term1058.getClass(), "longOpts", term1064);
        setField(term1058, term1058.getClass(), "requiredOpts", term1069);
        setField(term1058, term1058.getClass(), "optionGroups", term1073);
        term1078 = (Object[]) newArray("java.lang.String", 0);
        term1079 = new HashMap();
        term1113 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Class.forName("java.util.Properties");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term1058;
        args[1] = term1078;
        args[2] = term1079;
        args[3] = term1113;
        try {
            callMethod(klass, "parse", argTypes, term953, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


