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
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Object;

public class Options_addOption_74403604223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298;
     Object term320;
     Object term3249;
     Object term3269;
     Object term3197;

    public Options_addOption_74403604223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term299 = new LinkedHashMap();
        LinkedHashMap term305 = new LinkedHashMap();
        ArrayList term311 = new ArrayList();
        HashMap term315 = new HashMap();
        term298 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term298, term298.getClass(), "shortOpts", term299);
        setField(term298, term298.getClass(), "longOpts", term305);
        setField(term298, term298.getClass(), "requiredOpts", term311);
        setField(term298, term298.getClass(), "optionGroups", term315);
        ArrayList term372 = new ArrayList();
        ((ArrayList) term372).add("MxlszYVzRf");
        ((ArrayList) term372).add("LQFpaHEwXR");
        ((ArrayList) term372).add("oVcInYnLWB");
        ((ArrayList) term372).add("aJlieCFVtF");
        ((ArrayList) term372).add("ZiaGIbnzTs");
        term320 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term320, term320.getClass(), "opt", "hRNSzYYIrc");
        setField(term320, term320.getClass(), "longOpt", "RMFIsYGgne");
        setField(term320, term320.getClass(), "argName", "NRdvgJlhkX");
        setField(term320, term320.getClass(), "description", "uuaPigETmJ");
        setBooleanField(term320, term320.getClass(), "required", false);
        setBooleanField(term320, term320.getClass(), "optionalArg", true);
        setIntField(term320, term320.getClass(), "numberOfArgs", 568599855);
        setField(term320, term320.getClass(), "type", null);
        setField(term320, term320.getClass(), "values", term372);
        setCharField(term320, term320.getClass(), "valuesep", 'P');
        LinkedHashMap term3250 = new LinkedHashMap();
        LinkedHashMap term3261 = new LinkedHashMap();
        ArrayList term3266 = new ArrayList();
        HashMap term3268 = new HashMap();
        term3249 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term3249, term3249.getClass(), "shortOpts", term3250);
        setField(term3249, term3249.getClass(), "longOpts", term3261);
        setField(term3249, term3249.getClass(), "requiredOpts", term3266);
        setField(term3249, term3249.getClass(), "optionGroups", term3268);
        ArrayList term3274 = new ArrayList();
        ((ArrayList) term3274).add((Object)null);
        ((ArrayList) term3274).add((Object)null);
        ((ArrayList) term3274).add((Object)null);
        ((ArrayList) term3274).add((Object)null);
        ((ArrayList) term3274).add((Object)null);
        term3269 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3269, term3269.getClass(), "opt", "");
        setField(term3269, term3269.getClass(), "longOpt", "");
        setField(term3269, term3269.getClass(), "argName", "");
        setField(term3269, term3269.getClass(), "description", "");
        setBooleanField(term3269, term3269.getClass(), "required", false);
        setBooleanField(term3269, term3269.getClass(), "optionalArg", true);
        setIntField(term3269, term3269.getClass(), "numberOfArgs", 568599855);
        setField(term3269, term3269.getClass(), "type", null);
        setField(term3269, term3269.getClass(), "values", term3274);
        setCharField(term3269, term3269.getClass(), "valuesep", 'P');
        LinkedHashMap term3198 = new LinkedHashMap();
        LinkedHashMap term3219 = new LinkedHashMap();
        ArrayList term3240 = new ArrayList();
        HashMap term3244 = new HashMap();
        term3197 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term3197, term3197.getClass(), "shortOpts", term3198);
        setField(term3197, term3197.getClass(), "longOpts", term3219);
        setField(term3197, term3197.getClass(), "requiredOpts", term3240);
        setField(term3197, term3197.getClass(), "optionGroups", term3244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term320;
        Object retValue = callMethod(klass, "addOption", argTypes, term298, args);
        assertTrue(recursiveEquals(term298, term3249));
        assertTrue(recursiveEquals(term320, term3269));
        assertTrue(recursiveEquals(retValue, term3197));
    }

};


