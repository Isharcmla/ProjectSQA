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
import java.util.ArrayList;
import java.util.HashMap;

public class DefaultParser_checkRequiredOptions_213268135430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1362;
     Object term7328;

    public DefaultParser_checkRequiredOptions_213268135430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1364 = new LinkedList();
        ArrayList term1367 = new ArrayList();
        HashMap term1372 = new HashMap();
        HashMap term1377 = new HashMap();
        ArrayList term1382 = new ArrayList();
        HashMap term1386 = new HashMap();
        ArrayList term1457 = new ArrayList();
        ArrayList term1463 = new ArrayList();
        term1362 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term1363 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term1371 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term1404 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1456 = newInstance(Class.forName("java.lang.Object"));
        setField(term1363, term1363.getClass(), "args", term1364);
        setField(term1363, term1363.getClass(), "options", term1367);
        setField(term1362, term1362.getClass(), "cmd", term1363);
        setField(term1371, term1371.getClass(), "shortOpts", term1372);
        setField(term1371, term1371.getClass(), "longOpts", term1377);
        setField(term1371, term1371.getClass(), "requiredOpts", term1382);
        setField(term1371, term1371.getClass(), "optionGroups", term1386);
        setField(term1362, term1362.getClass(), "options", term1371);
        setBooleanField(term1362, term1362.getClass(), "stopAtNonOption", true);
        setField(term1362, term1362.getClass(), "currentToken", "hxCBltsObl");
        setField(term1404, term1404.getClass(), "opt", "BndsHwAFMv");
        setField(term1404, term1404.getClass(), "longOpt", "GzFkzHGYFt");
        setField(term1404, term1404.getClass(), "argName", "tShwQLRGNe");
        setField(term1404, term1404.getClass(), "description", "LvtrsXUliU");
        setBooleanField(term1404, term1404.getClass(), "required", true);
        setBooleanField(term1404, term1404.getClass(), "optionalArg", true);
        setIntField(term1404, term1404.getClass(), "numberOfArgs", -616727354);
        setField(term1404, term1404.getClass(), "type", term1456);
        setField(term1404, term1404.getClass(), "values", term1457);
        setCharField(term1404, term1404.getClass(), "valuesep", 'n');
        setField(term1362, term1362.getClass(), "currentOption", term1404);
        setBooleanField(term1362, term1362.getClass(), "skipParsing", false);
        setField(term1362, term1362.getClass(), "expectedOpts", term1463);
        LinkedList term7330 = new LinkedList();
        ArrayList term7331 = new ArrayList();
        HashMap term7334 = new HashMap();
        HashMap term7335 = new HashMap();
        ArrayList term7336 = new ArrayList();
        HashMap term7338 = new HashMap();
        ArrayList term7351 = new ArrayList();
        ArrayList term7353 = new ArrayList();
        term7328 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term7329 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term7333 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term7341 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term7350 = newInstance(Class.forName("java.lang.Object"));
        setField(term7329, term7329.getClass(), "args", term7330);
        setField(term7329, term7329.getClass(), "options", term7331);
        setField(term7328, term7328.getClass(), "cmd", term7329);
        setField(term7333, term7333.getClass(), "shortOpts", term7334);
        setField(term7333, term7333.getClass(), "longOpts", term7335);
        setField(term7333, term7333.getClass(), "requiredOpts", term7336);
        setField(term7333, term7333.getClass(), "optionGroups", term7338);
        setField(term7328, term7328.getClass(), "options", term7333);
        setBooleanField(term7328, term7328.getClass(), "stopAtNonOption", true);
        setField(term7328, term7328.getClass(), "currentToken", "hxCBltsObl");
        setField(term7341, term7341.getClass(), "opt", "BndsHwAFMv");
        setField(term7341, term7341.getClass(), "longOpt", "GzFkzHGYFt");
        setField(term7341, term7341.getClass(), "argName", "tShwQLRGNe");
        setField(term7341, term7341.getClass(), "description", "LvtrsXUliU");
        setBooleanField(term7341, term7341.getClass(), "required", true);
        setBooleanField(term7341, term7341.getClass(), "optionalArg", true);
        setIntField(term7341, term7341.getClass(), "numberOfArgs", -616727354);
        setField(term7341, term7341.getClass(), "type", term7350);
        setField(term7341, term7341.getClass(), "values", term7351);
        setCharField(term7341, term7341.getClass(), "valuesep", 'n');
        setField(term7328, term7328.getClass(), "currentOption", term7341);
        setBooleanField(term7328, term7328.getClass(), "skipParsing", false);
        setField(term7328, term7328.getClass(), "expectedOpts", term7353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkRequiredOptions", argTypes, term1362, args);
        assertTrue(recursiveEquals(term1362, term7328));
    }

};


