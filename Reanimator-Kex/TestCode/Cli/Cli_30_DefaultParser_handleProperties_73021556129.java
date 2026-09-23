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

public class DefaultParser_handleProperties_73021556129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1165;
     Object term1270;

    public DefaultParser_handleProperties_73021556129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1167 = new LinkedList();
        ArrayList term1170 = new ArrayList();
        HashMap term1175 = new HashMap();
        HashMap term1180 = new HashMap();
        ArrayList term1185 = new ArrayList();
        HashMap term1189 = new HashMap();
        ArrayList term1260 = new ArrayList();
        ArrayList term1266 = new ArrayList();
        term1165 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term1166 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term1174 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term1207 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1259 = newInstance(Class.forName("java.lang.Object"));
        setField(term1166, term1166.getClass(), "args", term1167);
        setField(term1166, term1166.getClass(), "options", term1170);
        setField(term1165, term1165.getClass(), "cmd", term1166);
        setField(term1174, term1174.getClass(), "shortOpts", term1175);
        setField(term1174, term1174.getClass(), "longOpts", term1180);
        setField(term1174, term1174.getClass(), "requiredOpts", term1185);
        setField(term1174, term1174.getClass(), "optionGroups", term1189);
        setField(term1165, term1165.getClass(), "options", term1174);
        setBooleanField(term1165, term1165.getClass(), "stopAtNonOption", false);
        setField(term1165, term1165.getClass(), "currentToken", "nyiiPDVjAc");
        setField(term1207, term1207.getClass(), "opt", "aKnKipADSo");
        setField(term1207, term1207.getClass(), "longOpt", "wSQxaModmm");
        setField(term1207, term1207.getClass(), "argName", "UlajhuVLaP");
        setField(term1207, term1207.getClass(), "description", "gGSMzuGICf");
        setBooleanField(term1207, term1207.getClass(), "required", false);
        setBooleanField(term1207, term1207.getClass(), "optionalArg", true);
        setIntField(term1207, term1207.getClass(), "numberOfArgs", -1922583790);
        setField(term1207, term1207.getClass(), "type", term1259);
        setField(term1207, term1207.getClass(), "values", term1260);
        setCharField(term1207, term1207.getClass(), "valuesep", 't');
        setField(term1165, term1165.getClass(), "currentOption", term1207);
        setBooleanField(term1165, term1165.getClass(), "skipParsing", true);
        setField(term1165, term1165.getClass(), "expectedOpts", term1266);
        term1270 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Properties");
        Object[] args = new Object[1];
        args[0] = term1270;
        try {
            callMethod(klass, "handleProperties", argTypes, term1165, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


