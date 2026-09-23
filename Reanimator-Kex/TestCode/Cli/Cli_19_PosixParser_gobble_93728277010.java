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
import java.lang.NullPointerException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedList;

public class PosixParser_gobble_93728277010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358;

    public PosixParser_gobble_93728277010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term359 = new ArrayList();
        ArrayList term417 = new ArrayList();
        HashMap term451 = new HashMap();
        HashMap term456 = new HashMap();
        ArrayList term461 = new ArrayList();
        HashMap term465 = new HashMap();
        LinkedList term443 = new LinkedList();
        ArrayList term446 = new ArrayList();
        ArrayList term470 = new ArrayList();
        term358 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term364 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term416 = newInstance(Class.forName("java.lang.Object"));
        Object term450 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term442 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term358, term358.getClass(), "tokens", term359);
        setBooleanField(term358, term358.getClass(), "eatTheRest", true);
        setField(term364, term364.getClass(), "opt", "RMFIsYGgne");
        setField(term364, term364.getClass(), "longOpt", "NRdvgJlhkX");
        setField(term364, term364.getClass(), "argName", "uuaPigETmJ");
        setField(term364, term364.getClass(), "description", "MxlszYVzRf");
        setBooleanField(term364, term364.getClass(), "required", false);
        setBooleanField(term364, term364.getClass(), "optionalArg", true);
        setIntField(term364, term364.getClass(), "numberOfArgs", 1484323161);
        setField(term364, term364.getClass(), "type", term416);
        setField(term364, term364.getClass(), "values", term417);
        setCharField(term364, term364.getClass(), "valuesep", 'E');
        setField(term358, term358.getClass(), "currentOption", term364);
        setField(term450, term450.getClass(), "shortOpts", term451);
        setField(term450, term450.getClass(), "longOpts", term456);
        setField(term450, term450.getClass(), "requiredOpts", term461);
        setField(term450, term450.getClass(), "optionGroups", term465);
        setField(term358, term358.getClass(), "options", term450);
        setField(term442, term442.getClass(), "args", term443);
        setField(term442, term442.getClass(), "options", term446);
        setField(term358, term358.getClass(), "cmd", term442);
        setField(term358, term358.getClass(), "requiredOptions", term470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "gobble", argTypes, term358, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


