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

public class PosixParser_process_168465003911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term514;
     Object term1809;

    public PosixParser_process_168465003911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term515 = new ArrayList();
        ArrayList term573 = new ArrayList();
        HashMap term607 = new HashMap();
        HashMap term612 = new HashMap();
        ArrayList term617 = new ArrayList();
        HashMap term621 = new HashMap();
        LinkedList term599 = new LinkedList();
        ArrayList term602 = new ArrayList();
        ArrayList term626 = new ArrayList();
        term514 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term520 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term572 = newInstance(Class.forName("java.lang.Object"));
        Object term606 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term598 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term514, term514.getClass(), "tokens", term515);
        setBooleanField(term514, term514.getClass(), "eatTheRest", false);
        setField(term520, term520.getClass(), "opt", "LQFpaHEwXR");
        setField(term520, term520.getClass(), "longOpt", "oVcInYnLWB");
        setField(term520, term520.getClass(), "argName", "aJlieCFVtF");
        setField(term520, term520.getClass(), "description", "ZiaGIbnzTs");
        setBooleanField(term520, term520.getClass(), "required", true);
        setBooleanField(term520, term520.getClass(), "optionalArg", false);
        setIntField(term520, term520.getClass(), "numberOfArgs", 391863371);
        setField(term520, term520.getClass(), "type", term572);
        setField(term520, term520.getClass(), "values", term573);
        setCharField(term520, term520.getClass(), "valuesep", 'B');
        setField(term514, term514.getClass(), "currentOption", term520);
        setField(term606, term606.getClass(), "shortOpts", term607);
        setField(term606, term606.getClass(), "longOpts", term612);
        setField(term606, term606.getClass(), "requiredOpts", term617);
        setField(term606, term606.getClass(), "optionGroups", term621);
        setField(term514, term514.getClass(), "options", term606);
        setField(term598, term598.getClass(), "args", term599);
        setField(term598, term598.getClass(), "options", term602);
        setField(term514, term514.getClass(), "cmd", term598);
        setField(term514, term514.getClass(), "requiredOptions", term626);
        ArrayList term1810 = new ArrayList();
        ((ArrayList) term1810).add("tbcdzjIfER");
        LinkedList term1815 = new LinkedList();
        ArrayList term1816 = new ArrayList();
        ArrayList term1818 = new ArrayList();
        term1809 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term1814 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1809, term1809.getClass(), "tokens", term1810);
        setBooleanField(term1809, term1809.getClass(), "eatTheRest", false);
        setField(term1809, term1809.getClass(), "currentOption", null);
        setField(term1809, term1809.getClass(), "options", null);
        setField(term1814, term1814.getClass(), "args", term1815);
        setField(term1814, term1814.getClass(), "options", term1816);
        setField(term1809, term1809.getClass(), "cmd", term1814);
        setField(term1809, term1809.getClass(), "requiredOptions", term1818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tbcdzjIfER";
        callMethod(klass, "process", argTypes, term514, args);
        assertTrue(recursiveEquals(term514, term1809));
    }

};


