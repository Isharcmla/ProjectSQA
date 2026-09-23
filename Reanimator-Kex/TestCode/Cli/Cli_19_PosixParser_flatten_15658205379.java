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

public class PosixParser_flatten_15658205379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157;
     Object term273;
     Object term293;
     Object term306;
     Object term1249;
     Object term1262;
     Object term1268;
     Object term1198;

    public PosixParser_flatten_15658205379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term158 = new ArrayList();
        ArrayList term216 = new ArrayList();
        HashMap term250 = new HashMap();
        HashMap term255 = new HashMap();
        ArrayList term260 = new ArrayList();
        HashMap term264 = new HashMap();
        LinkedList term242 = new LinkedList();
        ArrayList term245 = new ArrayList();
        ArrayList term269 = new ArrayList();
        term157 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term163 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term215 = newInstance(Class.forName("java.lang.Object"));
        Object term249 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term241 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term157, term157.getClass(), "tokens", term158);
        setBooleanField(term157, term157.getClass(), "eatTheRest", false);
        setField(term163, term163.getClass(), "opt", "jJCZpVmanW");
        setField(term163, term163.getClass(), "longOpt", "EGtDIRbSSb");
        setField(term163, term163.getClass(), "argName", "SzjVpOQTyS");
        setField(term163, term163.getClass(), "description", "MjGYSRKTNF");
        setBooleanField(term163, term163.getClass(), "required", true);
        setBooleanField(term163, term163.getClass(), "optionalArg", true);
        setIntField(term163, term163.getClass(), "numberOfArgs", 1162663216);
        setField(term163, term163.getClass(), "type", term215);
        setField(term163, term163.getClass(), "values", term216);
        setCharField(term163, term163.getClass(), "valuesep", 'A');
        setField(term157, term157.getClass(), "currentOption", term163);
        setField(term249, term249.getClass(), "shortOpts", term250);
        setField(term249, term249.getClass(), "longOpts", term255);
        setField(term249, term249.getClass(), "requiredOpts", term260);
        setField(term249, term249.getClass(), "optionGroups", term264);
        setField(term157, term157.getClass(), "options", term249);
        setField(term241, term241.getClass(), "args", term242);
        setField(term241, term241.getClass(), "options", term245);
        setField(term157, term157.getClass(), "cmd", term241);
        setField(term157, term157.getClass(), "requiredOptions", term269);
        HashMap term274 = new HashMap();
        HashMap term279 = new HashMap();
        ArrayList term284 = new ArrayList();
        HashMap term288 = new HashMap();
        term273 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term273, term273.getClass(), "shortOpts", term274);
        setField(term273, term273.getClass(), "longOpts", term279);
        setField(term273, term273.getClass(), "requiredOpts", term284);
        setField(term273, term273.getClass(), "optionGroups", term288);
        term293 = (Object[]) newArray("java.lang.String", 1);
        setElement(term293, 0, "hRNSzYYIrc");
        term306 = new Boolean(true);
        ArrayList term1250 = new ArrayList();
        ((ArrayList) term1250).add("--");
        ((ArrayList) term1250).add("hRNSzYYIrc");
        LinkedList term1257 = new LinkedList();
        ArrayList term1258 = new ArrayList();
        ArrayList term1260 = new ArrayList();
        term1249 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term1256 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1249, term1249.getClass(), "tokens", term1250);
        setBooleanField(term1249, term1249.getClass(), "eatTheRest", true);
        setField(term1249, term1249.getClass(), "currentOption", null);
        setField(term1249, term1249.getClass(), "options", null);
        setField(term1256, term1256.getClass(), "args", term1257);
        setField(term1256, term1256.getClass(), "options", term1258);
        setField(term1249, term1249.getClass(), "cmd", term1256);
        setField(term1249, term1249.getClass(), "requiredOptions", term1260);
        HashMap term1263 = new HashMap();
        HashMap term1264 = new HashMap();
        ArrayList term1265 = new ArrayList();
        HashMap term1267 = new HashMap();
        term1262 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1262, term1262.getClass(), "shortOpts", term1263);
        setField(term1262, term1262.getClass(), "longOpts", term1264);
        setField(term1262, term1262.getClass(), "requiredOpts", term1265);
        setField(term1262, term1262.getClass(), "optionGroups", term1267);
        term1268 = (Object[]) newArray("java.lang.String", 1);
        setElement(term1268, 0, "hRNSzYYIrc");
        term1198 = (Object[]) newArray("java.lang.String", 2);
        setElement(term1198, 0, "--");
        setElement(term1198, 1, "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term273;
        args[1] = term293;
        args[2] = term306;
        Object retValue = callMethod(klass, "flatten", argTypes, term157, args);
        assertTrue(recursiveEquals(term157, term1249));
        assertTrue(recursiveEquals(term273, term1262));
        assertTrue(recursiveEquals(term293, term1268));
        assertTrue(recursiveEquals(term306, true));
        assertTrue(recursiveEquals(retValue, term1198));
    }

};


