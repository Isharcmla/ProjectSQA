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

public class PosixParser_init_16217136839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term1257;

    public PosixParser_init_16217136839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2 = new ArrayList();
        ArrayList term60 = new ArrayList();
        HashMap term94 = new HashMap();
        HashMap term99 = new HashMap();
        ArrayList term104 = new ArrayList();
        HashMap term108 = new HashMap();
        LinkedList term86 = new LinkedList();
        ArrayList term89 = new ArrayList();
        ArrayList term113 = new ArrayList();
        term1 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term7 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term59 = newInstance(Class.forName("java.lang.Object"));
        Object term93 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term85 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1, term1.getClass(), "tokens", term2);
        setBooleanField(term1, term1.getClass(), "eatTheRest", false);
        setField(term7, term7.getClass(), "opt", "PAEBtnZtTD");
        setField(term7, term7.getClass(), "longOpt", "sjlJAEtRrb");
        setField(term7, term7.getClass(), "argName", "MuLcgQHgqz");
        setField(term7, term7.getClass(), "description", "xxtlPwDYFs");
        setBooleanField(term7, term7.getClass(), "required", false);
        setBooleanField(term7, term7.getClass(), "optionalArg", false);
        setIntField(term7, term7.getClass(), "numberOfArgs", 568599855);
        setField(term7, term7.getClass(), "type", term59);
        setField(term7, term7.getClass(), "values", term60);
        setCharField(term7, term7.getClass(), "valuesep", 'P');
        setField(term1, term1.getClass(), "currentOption", term7);
        setField(term93, term93.getClass(), "shortOpts", term94);
        setField(term93, term93.getClass(), "longOpts", term99);
        setField(term93, term93.getClass(), "requiredOpts", term104);
        setField(term93, term93.getClass(), "optionGroups", term108);
        setField(term1, term1.getClass(), "options", term93);
        setField(term85, term85.getClass(), "args", term86);
        setField(term85, term85.getClass(), "options", term89);
        setField(term1, term1.getClass(), "cmd", term85);
        setField(term1, term1.getClass(), "requiredOptions", term113);
        ArrayList term1258 = new ArrayList();
        LinkedList term1261 = new LinkedList();
        ArrayList term1262 = new ArrayList();
        ArrayList term1264 = new ArrayList();
        term1257 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term1260 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1257, term1257.getClass(), "tokens", term1258);
        setBooleanField(term1257, term1257.getClass(), "eatTheRest", false);
        setField(term1257, term1257.getClass(), "currentOption", null);
        setField(term1257, term1257.getClass(), "options", null);
        setField(term1260, term1260.getClass(), "args", term1261);
        setField(term1260, term1260.getClass(), "options", term1262);
        setField(term1257, term1257.getClass(), "cmd", term1260);
        setField(term1257, term1257.getClass(), "requiredOptions", term1264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term1257));
    }

};


