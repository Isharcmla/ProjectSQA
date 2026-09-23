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

public class DefaultParser_handleConcatenatedOptions_55093526747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4873;
     Object term15347;

    public DefaultParser_handleConcatenatedOptions_55093526747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term4875 = new LinkedList();
        ArrayList term4878 = new ArrayList();
        LinkedHashMap term4883 = new LinkedHashMap();
        LinkedHashMap term4889 = new LinkedHashMap();
        ArrayList term4895 = new ArrayList();
        LinkedHashMap term4899 = new LinkedHashMap();
        ArrayList term4970 = new ArrayList();
        ((ArrayList) term4970).add("");
        ArrayList term4977 = new ArrayList();
        term4873 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term4874 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term4882 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term4918 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4874, term4874.getClass(), "args", term4875);
        setField(term4874, term4874.getClass(), "options", term4878);
        setField(term4873, term4873.getClass(), "cmd", term4874);
        setField(term4882, term4882.getClass(), "shortOpts", term4883);
        setField(term4882, term4882.getClass(), "longOpts", term4889);
        setField(term4882, term4882.getClass(), "requiredOpts", term4895);
        setField(term4882, term4882.getClass(), "optionGroups", term4899);
        setField(term4873, term4873.getClass(), "options", term4882);
        setBooleanField(term4873, term4873.getClass(), "stopAtNonOption", false);
        setField(term4873, term4873.getClass(), "currentToken", "zcorEihhLK");
        setField(term4918, term4918.getClass(), "opt", "GrqozDKFOk");
        setField(term4918, term4918.getClass(), "longOpt", "CFyoseFGLF");
        setField(term4918, term4918.getClass(), "argName", "SFqCrhEWLm");
        setField(term4918, term4918.getClass(), "description", "GZdcJyZntS");
        setBooleanField(term4918, term4918.getClass(), "required", false);
        setBooleanField(term4918, term4918.getClass(), "optionalArg", true);
        setIntField(term4918, term4918.getClass(), "numberOfArgs", -1007160944);
        setField(term4918, term4918.getClass(), "type", null);
        setField(term4918, term4918.getClass(), "values", term4970);
        setCharField(term4918, term4918.getClass(), "valuesep", 'g');
        setField(term4873, term4873.getClass(), "currentOption", term4918);
        setBooleanField(term4873, term4873.getClass(), "skipParsing", true);
        setField(term4873, term4873.getClass(), "expectedOpts", term4977);
        LinkedList term15349 = new LinkedList();
        ((LinkedList) term15349).add("");
        ArrayList term15352 = new ArrayList();
        LinkedHashMap term15355 = new LinkedHashMap();
        LinkedHashMap term15356 = new LinkedHashMap();
        ArrayList term15357 = new ArrayList();
        LinkedHashMap term15359 = new LinkedHashMap();
        ArrayList term15371 = new ArrayList();
        ((ArrayList) term15371).add("");
        ArrayList term15374 = new ArrayList();
        term15347 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term15348 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term15354 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term15362 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term15348, term15348.getClass(), "args", term15349);
        setField(term15348, term15348.getClass(), "options", term15352);
        setField(term15347, term15347.getClass(), "cmd", term15348);
        setField(term15354, term15354.getClass(), "shortOpts", term15355);
        setField(term15354, term15354.getClass(), "longOpts", term15356);
        setField(term15354, term15354.getClass(), "requiredOpts", term15357);
        setField(term15354, term15354.getClass(), "optionGroups", term15359);
        setField(term15347, term15347.getClass(), "options", term15354);
        setBooleanField(term15347, term15347.getClass(), "stopAtNonOption", false);
        setField(term15347, term15347.getClass(), "currentToken", "zcorEihhLK");
        setField(term15362, term15362.getClass(), "opt", "GrqozDKFOk");
        setField(term15362, term15362.getClass(), "longOpt", "CFyoseFGLF");
        setField(term15362, term15362.getClass(), "argName", "SFqCrhEWLm");
        setField(term15362, term15362.getClass(), "description", "GZdcJyZntS");
        setBooleanField(term15362, term15362.getClass(), "required", false);
        setBooleanField(term15362, term15362.getClass(), "optionalArg", true);
        setIntField(term15362, term15362.getClass(), "numberOfArgs", -1007160944);
        setField(term15362, term15362.getClass(), "type", null);
        setField(term15362, term15362.getClass(), "values", term15371);
        setCharField(term15362, term15362.getClass(), "valuesep", 'g');
        setField(term15347, term15347.getClass(), "currentOption", term15362);
        setBooleanField(term15347, term15347.getClass(), "skipParsing", true);
        setField(term15347, term15347.getClass(), "expectedOpts", term15374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WXMWFDGcLB";
        callMethod(klass, "handleConcatenatedOptions", argTypes, term4873, args);
        assertTrue(recursiveEquals(term4873, term15347));
    }

};


