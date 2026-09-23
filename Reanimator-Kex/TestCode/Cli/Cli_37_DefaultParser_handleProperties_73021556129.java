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

public class DefaultParser_handleProperties_73021556129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1197;
     Object term1306;

    public DefaultParser_handleProperties_73021556129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1199 = new LinkedList();
        ArrayList term1202 = new ArrayList();
        LinkedHashMap term1207 = new LinkedHashMap();
        LinkedHashMap term1213 = new LinkedHashMap();
        ArrayList term1219 = new ArrayList();
        LinkedHashMap term1223 = new LinkedHashMap();
        ArrayList term1294 = new ArrayList();
        ((ArrayList) term1294).add("");
        ((ArrayList) term1294).add("");
        ArrayList term1302 = new ArrayList();
        term1197 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term1198 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term1206 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term1242 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1198, term1198.getClass(), "args", term1199);
        setField(term1198, term1198.getClass(), "options", term1202);
        setField(term1197, term1197.getClass(), "cmd", term1198);
        setField(term1206, term1206.getClass(), "shortOpts", term1207);
        setField(term1206, term1206.getClass(), "longOpts", term1213);
        setField(term1206, term1206.getClass(), "requiredOpts", term1219);
        setField(term1206, term1206.getClass(), "optionGroups", term1223);
        setField(term1197, term1197.getClass(), "options", term1206);
        setBooleanField(term1197, term1197.getClass(), "stopAtNonOption", false);
        setField(term1197, term1197.getClass(), "currentToken", "nGKItKLYNC");
        setField(term1242, term1242.getClass(), "opt", "UiUYnPrcCi");
        setField(term1242, term1242.getClass(), "longOpt", "UoYtihxVaS");
        setField(term1242, term1242.getClass(), "argName", "JDswTTCZHV");
        setField(term1242, term1242.getClass(), "description", "onpbIeEKoi");
        setBooleanField(term1242, term1242.getClass(), "required", false);
        setBooleanField(term1242, term1242.getClass(), "optionalArg", true);
        setIntField(term1242, term1242.getClass(), "numberOfArgs", -1922583790);
        setField(term1242, term1242.getClass(), "type", null);
        setField(term1242, term1242.getClass(), "values", term1294);
        setCharField(term1242, term1242.getClass(), "valuesep", 't');
        setField(term1197, term1197.getClass(), "currentOption", term1242);
        setBooleanField(term1197, term1197.getClass(), "skipParsing", true);
        setField(term1197, term1197.getClass(), "expectedOpts", term1302);
        term1306 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Properties");
        Object[] args = new Object[1];
        args[0] = term1306;
        try {
            callMethod(klass, "handleProperties", argTypes, term1197, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


