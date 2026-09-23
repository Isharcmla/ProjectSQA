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
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.lang.Boolean;

public class DefaultParser_parse_96212388728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977;
     Object term1087;
     Object term1110;
     Object term1111;
     Object term1145;

    public DefaultParser_parse_96212388728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term979 = new LinkedList();
        ArrayList term982 = new ArrayList();
        LinkedHashMap term987 = new LinkedHashMap();
        LinkedHashMap term993 = new LinkedHashMap();
        ArrayList term999 = new ArrayList();
        LinkedHashMap term1003 = new LinkedHashMap();
        ArrayList term1074 = new ArrayList();
        ((ArrayList) term1074).add("");
        ((ArrayList) term1074).add("");
        ((ArrayList) term1074).add("");
        ArrayList term1083 = new ArrayList();
        term977 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term978 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term986 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term1022 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term978, term978.getClass(), "args", term979);
        setField(term978, term978.getClass(), "options", term982);
        setField(term977, term977.getClass(), "cmd", term978);
        setField(term986, term986.getClass(), "shortOpts", term987);
        setField(term986, term986.getClass(), "longOpts", term993);
        setField(term986, term986.getClass(), "requiredOpts", term999);
        setField(term986, term986.getClass(), "optionGroups", term1003);
        setField(term977, term977.getClass(), "options", term986);
        setBooleanField(term977, term977.getClass(), "stopAtNonOption", true);
        setField(term977, term977.getClass(), "currentToken", "gGSMzuGICf");
        setField(term1022, term1022.getClass(), "opt", "hxCBltsObl");
        setField(term1022, term1022.getClass(), "longOpt", "BndsHwAFMv");
        setField(term1022, term1022.getClass(), "argName", "GzFkzHGYFt");
        setField(term1022, term1022.getClass(), "description", "tShwQLRGNe");
        setBooleanField(term1022, term1022.getClass(), "required", false);
        setBooleanField(term1022, term1022.getClass(), "optionalArg", false);
        setIntField(term1022, term1022.getClass(), "numberOfArgs", 391863371);
        setField(term1022, term1022.getClass(), "type", null);
        setField(term1022, term1022.getClass(), "values", term1074);
        setCharField(term1022, term1022.getClass(), "valuesep", 'B');
        setField(term977, term977.getClass(), "currentOption", term1022);
        setBooleanField(term977, term977.getClass(), "skipParsing", true);
        setField(term977, term977.getClass(), "expectedOpts", term1083);
        LinkedHashMap term1088 = new LinkedHashMap();
        LinkedHashMap term1094 = new LinkedHashMap();
        ArrayList term1100 = new ArrayList();
        LinkedHashMap term1104 = new LinkedHashMap();
        term1087 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1087, term1087.getClass(), "shortOpts", term1088);
        setField(term1087, term1087.getClass(), "longOpts", term1094);
        setField(term1087, term1087.getClass(), "requiredOpts", term1100);
        setField(term1087, term1087.getClass(), "optionGroups", term1104);
        term1110 = (Object[]) newArray("java.lang.String", 0);
        term1111 = new HashMap();
        term1145 = new Boolean(true);
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
        args[0] = term1087;
        args[1] = term1110;
        args[2] = term1111;
        args[3] = term1145;
        try {
            callMethod(klass, "parse", argTypes, term977, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


