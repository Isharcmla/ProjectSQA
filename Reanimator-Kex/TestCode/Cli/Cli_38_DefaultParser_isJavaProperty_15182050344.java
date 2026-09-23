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
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class DefaultParser_isJavaProperty_15182050344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3897;
     Object term13421;

    public DefaultParser_isJavaProperty_15182050344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term3899 = new LinkedList();
        ArrayList term3902 = new ArrayList();
        LinkedHashMap term3907 = new LinkedHashMap();
        LinkedHashMap term3913 = new LinkedHashMap();
        ArrayList term3919 = new ArrayList();
        LinkedHashMap term3923 = new LinkedHashMap();
        ArrayList term3994 = new ArrayList();
        ArrayList term4000 = new ArrayList();
        term3897 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term3898 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term3906 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term3942 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3898, term3898.getClass(), "args", term3899);
        setField(term3898, term3898.getClass(), "options", term3902);
        setField(term3897, term3897.getClass(), "cmd", term3898);
        setField(term3906, term3906.getClass(), "shortOpts", term3907);
        setField(term3906, term3906.getClass(), "longOpts", term3913);
        setField(term3906, term3906.getClass(), "requiredOpts", term3919);
        setField(term3906, term3906.getClass(), "optionGroups", term3923);
        setField(term3897, term3897.getClass(), "options", term3906);
        setBooleanField(term3897, term3897.getClass(), "stopAtNonOption", false);
        setField(term3897, term3897.getClass(), "currentToken", "lihXWlGDxk");
        setField(term3942, term3942.getClass(), "opt", "JmcmxoGhIK");
        setField(term3942, term3942.getClass(), "longOpt", "jXzmYyrnnT");
        setField(term3942, term3942.getClass(), "argName", "igCAtimmYB");
        setField(term3942, term3942.getClass(), "description", "DyiXbeYIaN");
        setBooleanField(term3942, term3942.getClass(), "required", true);
        setBooleanField(term3942, term3942.getClass(), "optionalArg", false);
        setIntField(term3942, term3942.getClass(), "numberOfArgs", 1048535127);
        setField(term3942, term3942.getClass(), "type", null);
        setField(term3942, term3942.getClass(), "values", term3994);
        setCharField(term3942, term3942.getClass(), "valuesep", 'b');
        setField(term3897, term3897.getClass(), "currentOption", term3942);
        setBooleanField(term3897, term3897.getClass(), "skipParsing", false);
        setField(term3897, term3897.getClass(), "expectedOpts", term4000);
        LinkedList term13423 = new LinkedList();
        ArrayList term13424 = new ArrayList();
        LinkedHashMap term13427 = new LinkedHashMap();
        LinkedHashMap term13428 = new LinkedHashMap();
        ArrayList term13429 = new ArrayList();
        LinkedHashMap term13431 = new LinkedHashMap();
        ArrayList term13443 = new ArrayList();
        ArrayList term13445 = new ArrayList();
        term13421 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term13422 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term13426 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term13434 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term13422, term13422.getClass(), "args", term13423);
        setField(term13422, term13422.getClass(), "options", term13424);
        setField(term13421, term13421.getClass(), "cmd", term13422);
        setField(term13426, term13426.getClass(), "shortOpts", term13427);
        setField(term13426, term13426.getClass(), "longOpts", term13428);
        setField(term13426, term13426.getClass(), "requiredOpts", term13429);
        setField(term13426, term13426.getClass(), "optionGroups", term13431);
        setField(term13421, term13421.getClass(), "options", term13426);
        setBooleanField(term13421, term13421.getClass(), "stopAtNonOption", false);
        setField(term13421, term13421.getClass(), "currentToken", "lihXWlGDxk");
        setField(term13434, term13434.getClass(), "opt", "JmcmxoGhIK");
        setField(term13434, term13434.getClass(), "longOpt", "jXzmYyrnnT");
        setField(term13434, term13434.getClass(), "argName", "igCAtimmYB");
        setField(term13434, term13434.getClass(), "description", "DyiXbeYIaN");
        setBooleanField(term13434, term13434.getClass(), "required", true);
        setBooleanField(term13434, term13434.getClass(), "optionalArg", false);
        setIntField(term13434, term13434.getClass(), "numberOfArgs", 1048535127);
        setField(term13434, term13434.getClass(), "type", null);
        setField(term13434, term13434.getClass(), "values", term13443);
        setCharField(term13434, term13434.getClass(), "valuesep", 'b');
        setField(term13421, term13421.getClass(), "currentOption", term13434);
        setBooleanField(term13421, term13421.getClass(), "skipParsing", false);
        setField(term13421, term13421.getClass(), "expectedOpts", term13445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VGizxZnyHX";
        Object retValue = callMethod(klass, "isJavaProperty", argTypes, term3897, args);
        assertTrue(recursiveEquals(term3897, term13421));
        assertTrue(recursiveEquals(retValue, false));
    }

};


