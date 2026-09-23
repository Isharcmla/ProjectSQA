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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.Boolean;

public class GnuParser_flatten_14048542123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term36;
     Object term56;
     Object term105;
     Object term325;
     Object term338;
     Object term344;
     Object term171;

    public GnuParser_flatten_14048542123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term3 = new LinkedList();
        HashMap term7 = new HashMap();
        Set<Object> term353 =  ((Map) term7).keySet();
        HashSet term6 = new HashSet((Collection<? extends Object>) term353);
        HashMap term13 = new HashMap();
        HashMap term18 = new HashMap();
        ArrayList term23 = new ArrayList();
        HashMap term27 = new HashMap();
        ArrayList term32 = new ArrayList();
        term1 = newInstance(Class.forName("org.apache.commons.cli.GnuParser"));
        Object term2 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term12 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term2, term2.getClass(), "args", term3);
        setField(term2, term2.getClass(), "options", term6);
        setField(term1, term1.getClass(), "cmd", term2);
        setField(term12, term12.getClass(), "shortOpts", term13);
        setField(term12, term12.getClass(), "longOpts", term18);
        setField(term12, term12.getClass(), "requiredOpts", term23);
        setField(term12, term12.getClass(), "optionGroups", term27);
        setField(term1, term1.getClass(), "options", term12);
        setField(term1, term1.getClass(), "requiredOptions", term32);
        HashMap term37 = new HashMap();
        HashMap term42 = new HashMap();
        ArrayList term47 = new ArrayList();
        HashMap term51 = new HashMap();
        term36 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term36, term36.getClass(), "shortOpts", term37);
        setField(term36, term36.getClass(), "longOpts", term42);
        setField(term36, term36.getClass(), "requiredOpts", term47);
        setField(term36, term36.getClass(), "optionGroups", term51);
        term56 = (Object[]) newArray("java.lang.String", 4);
        setElement(term56, 0, "PAEBtnZtTD");
        setElement(term56, 1, "sjlJAEtRrb");
        setElement(term56, 2, "MuLcgQHgqz");
        setElement(term56, 3, "xxtlPwDYFs");
        term105 = new Boolean(false);
        LinkedList term327 = new LinkedList();
        HashMap term329 = new HashMap();
        Set<Object> term394 =  ((Map) term329).keySet();
        HashSet term328 = new HashSet((Collection<? extends Object>) term394);
        HashMap term331 = new HashMap();
        HashMap term332 = new HashMap();
        ArrayList term333 = new ArrayList();
        HashMap term335 = new HashMap();
        ArrayList term336 = new ArrayList();
        term325 = newInstance(Class.forName("org.apache.commons.cli.GnuParser"));
        Object term326 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term330 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term326, term326.getClass(), "args", term327);
        setField(term326, term326.getClass(), "options", term328);
        setField(term325, term325.getClass(), "cmd", term326);
        setField(term330, term330.getClass(), "shortOpts", term331);
        setField(term330, term330.getClass(), "longOpts", term332);
        setField(term330, term330.getClass(), "requiredOpts", term333);
        setField(term330, term330.getClass(), "optionGroups", term335);
        setField(term325, term325.getClass(), "options", term330);
        setField(term325, term325.getClass(), "requiredOptions", term336);
        HashMap term339 = new HashMap();
        HashMap term340 = new HashMap();
        ArrayList term341 = new ArrayList();
        HashMap term343 = new HashMap();
        term338 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term338, term338.getClass(), "shortOpts", term339);
        setField(term338, term338.getClass(), "longOpts", term340);
        setField(term338, term338.getClass(), "requiredOpts", term341);
        setField(term338, term338.getClass(), "optionGroups", term343);
        term344 = (Object[]) newArray("java.lang.String", 4);
        setElement(term344, 0, "PAEBtnZtTD");
        setElement(term344, 1, "sjlJAEtRrb");
        setElement(term344, 2, "MuLcgQHgqz");
        setElement(term344, 3, "xxtlPwDYFs");
        term171 = (Object[]) newArray("java.lang.String", 4);
        setElement(term171, 0, "PAEBtnZtTD");
        setElement(term171, 1, "sjlJAEtRrb");
        setElement(term171, 2, "MuLcgQHgqz");
        setElement(term171, 3, "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.GnuParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term36;
        args[1] = term56;
        args[2] = term105;
        Object retValue = callMethod(klass, "flatten", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term325));
        assertTrue(recursiveEquals(term36, term338));
        assertTrue(recursiveEquals(term56, term344));
        assertTrue(recursiveEquals(term105, false));
        assertTrue(recursiveEquals(retValue, term171));
    }

};


