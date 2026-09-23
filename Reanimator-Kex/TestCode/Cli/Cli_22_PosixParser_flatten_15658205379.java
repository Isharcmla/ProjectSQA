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
     Object term59;
     Object term117;
     Object term137;
     Object term174;
     Object term751;
     Object term766;
     Object term772;
     Object term656;

    public PosixParser_flatten_15658205379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term60 = new ArrayList();
        HashMap term94 = new HashMap();
        HashMap term99 = new HashMap();
        ArrayList term104 = new ArrayList();
        HashMap term108 = new HashMap();
        LinkedList term86 = new LinkedList();
        ArrayList term89 = new ArrayList();
        ArrayList term113 = new ArrayList();
        term59 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term93 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term85 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term59, term59.getClass(), "tokens", term60);
        setBooleanField(term59, term59.getClass(), "eatTheRest", false);
        setField(term93, term93.getClass(), "shortOpts", term94);
        setField(term93, term93.getClass(), "longOpts", term99);
        setField(term93, term93.getClass(), "requiredOpts", term104);
        setField(term93, term93.getClass(), "optionGroups", term108);
        setField(term59, term59.getClass(), "options", term93);
        setField(term85, term85.getClass(), "args", term86);
        setField(term85, term85.getClass(), "options", term89);
        setField(term59, term59.getClass(), "cmd", term85);
        setField(term59, term59.getClass(), "requiredOptions", term113);
        HashMap term118 = new HashMap();
        HashMap term123 = new HashMap();
        ArrayList term128 = new ArrayList();
        HashMap term132 = new HashMap();
        term117 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term117, term117.getClass(), "shortOpts", term118);
        setField(term117, term117.getClass(), "longOpts", term123);
        setField(term117, term117.getClass(), "requiredOpts", term128);
        setField(term117, term117.getClass(), "optionGroups", term132);
        term137 = (Object[]) newArray("java.lang.String", 3);
        setElement(term137, 0, "PAEBtnZtTD");
        setElement(term137, 1, "sjlJAEtRrb");
        setElement(term137, 2, "MuLcgQHgqz");
        term174 = new Boolean(false);
        ArrayList term752 = new ArrayList();
        ((ArrayList) term752).add("PAEBtnZtTD");
        ((ArrayList) term752).add("sjlJAEtRrb");
        ((ArrayList) term752).add("MuLcgQHgqz");
        LinkedList term761 = new LinkedList();
        ArrayList term762 = new ArrayList();
        ArrayList term764 = new ArrayList();
        term751 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term760 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term751, term751.getClass(), "tokens", term752);
        setBooleanField(term751, term751.getClass(), "eatTheRest", false);
        setField(term751, term751.getClass(), "options", null);
        setField(term760, term760.getClass(), "args", term761);
        setField(term760, term760.getClass(), "options", term762);
        setField(term751, term751.getClass(), "cmd", term760);
        setField(term751, term751.getClass(), "requiredOptions", term764);
        HashMap term767 = new HashMap();
        HashMap term768 = new HashMap();
        ArrayList term769 = new ArrayList();
        HashMap term771 = new HashMap();
        term766 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term766, term766.getClass(), "shortOpts", term767);
        setField(term766, term766.getClass(), "longOpts", term768);
        setField(term766, term766.getClass(), "requiredOpts", term769);
        setField(term766, term766.getClass(), "optionGroups", term771);
        term772 = (Object[]) newArray("java.lang.String", 3);
        setElement(term772, 0, "PAEBtnZtTD");
        setElement(term772, 1, "sjlJAEtRrb");
        setElement(term772, 2, "MuLcgQHgqz");
        term656 = (Object[]) newArray("java.lang.String", 3);
        setElement(term656, 0, "PAEBtnZtTD");
        setElement(term656, 1, "sjlJAEtRrb");
        setElement(term656, 2, "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term117;
        args[1] = term137;
        args[2] = term174;
        Object retValue = callMethod(klass, "flatten", argTypes, term59, args);
        assertTrue(recursiveEquals(term59, term751));
        assertTrue(recursiveEquals(term117, term766));
        assertTrue(recursiveEquals(term137, term772));
        assertTrue(recursiveEquals(term174, false));
        assertTrue(recursiveEquals(retValue, term656));
    }

};


