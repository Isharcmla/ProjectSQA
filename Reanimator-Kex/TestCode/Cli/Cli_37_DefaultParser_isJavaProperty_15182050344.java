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
     Object term13087;

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
        LinkedList term13089 = new LinkedList();
        ArrayList term13090 = new ArrayList();
        LinkedHashMap term13093 = new LinkedHashMap();
        LinkedHashMap term13094 = new LinkedHashMap();
        ArrayList term13095 = new ArrayList();
        LinkedHashMap term13097 = new LinkedHashMap();
        ArrayList term13109 = new ArrayList();
        ArrayList term13111 = new ArrayList();
        term13087 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term13088 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term13092 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term13100 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term13088, term13088.getClass(), "args", term13089);
        setField(term13088, term13088.getClass(), "options", term13090);
        setField(term13087, term13087.getClass(), "cmd", term13088);
        setField(term13092, term13092.getClass(), "shortOpts", term13093);
        setField(term13092, term13092.getClass(), "longOpts", term13094);
        setField(term13092, term13092.getClass(), "requiredOpts", term13095);
        setField(term13092, term13092.getClass(), "optionGroups", term13097);
        setField(term13087, term13087.getClass(), "options", term13092);
        setBooleanField(term13087, term13087.getClass(), "stopAtNonOption", false);
        setField(term13087, term13087.getClass(), "currentToken", "lihXWlGDxk");
        setField(term13100, term13100.getClass(), "opt", "JmcmxoGhIK");
        setField(term13100, term13100.getClass(), "longOpt", "jXzmYyrnnT");
        setField(term13100, term13100.getClass(), "argName", "igCAtimmYB");
        setField(term13100, term13100.getClass(), "description", "DyiXbeYIaN");
        setBooleanField(term13100, term13100.getClass(), "required", true);
        setBooleanField(term13100, term13100.getClass(), "optionalArg", false);
        setIntField(term13100, term13100.getClass(), "numberOfArgs", 1048535127);
        setField(term13100, term13100.getClass(), "type", null);
        setField(term13100, term13100.getClass(), "values", term13109);
        setCharField(term13100, term13100.getClass(), "valuesep", 'b');
        setField(term13087, term13087.getClass(), "currentOption", term13100);
        setBooleanField(term13087, term13087.getClass(), "skipParsing", false);
        setField(term13087, term13087.getClass(), "expectedOpts", term13111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VGizxZnyHX";
        Object retValue = callMethod(klass, "isJavaProperty", argTypes, term3897, args);
        assertTrue(recursiveEquals(term3897, term13087));
        assertTrue(recursiveEquals(retValue, false));
    }

};


