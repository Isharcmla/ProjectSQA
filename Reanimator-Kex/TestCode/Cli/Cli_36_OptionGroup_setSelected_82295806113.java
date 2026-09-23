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
import org.apache.commons.cli.AlreadySelectedException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.ArrayList;

public class OptionGroup_setSelected_82295806113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295;
     Object term314;

    public OptionGroup_setSelected_82295806113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term296 = new HashMap();
        term295 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term295, term295.getClass(), "optionMap", term296);
        setField(term295, term295.getClass(), "selected", "MxlszYVzRf");
        setBooleanField(term295, term295.getClass(), "required", true);
        ArrayList term366 = new ArrayList();
        ((ArrayList) term366).add("tbcdzjIfER");
        ((ArrayList) term366).add("HyxfbSQYBe");
        ((ArrayList) term366).add("pCTimMblYc");
        ((ArrayList) term366).add("hNxWaHcfhY");
        term314 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term314, term314.getClass(), "opt", "LQFpaHEwXR");
        setField(term314, term314.getClass(), "longOpt", "oVcInYnLWB");
        setField(term314, term314.getClass(), "argName", "aJlieCFVtF");
        setField(term314, term314.getClass(), "description", "ZiaGIbnzTs");
        setBooleanField(term314, term314.getClass(), "required", true);
        setBooleanField(term314, term314.getClass(), "optionalArg", true);
        setIntField(term314, term314.getClass(), "numberOfArgs", 1162663216);
        setField(term314, term314.getClass(), "type", null);
        setField(term314, term314.getClass(), "values", term366);
        setCharField(term314, term314.getClass(), "valuesep", 'A');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term314;
        try {
            callMethod(klass, "setSelected", argTypes, term295, args);
            assertTrue(false);
        }
        catch (AlreadySelectedException e) {
        }

    }

};


