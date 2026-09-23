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

public class Options_getOptionGroup_125818816032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term813;
     Object term835;
     Object term4044;
     Object term4050;

    public Options_getOptionGroup_125818816032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term814 = new LinkedHashMap();
        LinkedHashMap term820 = new LinkedHashMap();
        ArrayList term826 = new ArrayList();
        HashMap term830 = new HashMap();
        term813 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term813, term813.getClass(), "shortOpts", term814);
        setField(term813, term813.getClass(), "longOpts", term820);
        setField(term813, term813.getClass(), "requiredOpts", term826);
        setField(term813, term813.getClass(), "optionGroups", term830);
        ArrayList term887 = new ArrayList();
        ((ArrayList) term887).add("flxyYxBRtu");
        ((ArrayList) term887).add("OclPbYPkcH");
        ((ArrayList) term887).add("IoAlmYsBwc");
        ((ArrayList) term887).add("TEParAifyi");
        term835 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term835, term835.getClass(), "opt", "xOEqzGAmDU");
        setField(term835, term835.getClass(), "longOpt", "eZFUvlxvGV");
        setField(term835, term835.getClass(), "argName", "BYqFIqCKAV");
        setField(term835, term835.getClass(), "description", "vrQLuWIDJX");
        setBooleanField(term835, term835.getClass(), "required", true);
        setBooleanField(term835, term835.getClass(), "optionalArg", true);
        setIntField(term835, term835.getClass(), "numberOfArgs", 1162663216);
        setField(term835, term835.getClass(), "type", null);
        setField(term835, term835.getClass(), "values", term887);
        setCharField(term835, term835.getClass(), "valuesep", 'A');
        LinkedHashMap term4045 = new LinkedHashMap();
        LinkedHashMap term4046 = new LinkedHashMap();
        ArrayList term4047 = new ArrayList();
        HashMap term4049 = new HashMap();
        term4044 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term4044, term4044.getClass(), "shortOpts", term4045);
        setField(term4044, term4044.getClass(), "longOpts", term4046);
        setField(term4044, term4044.getClass(), "requiredOpts", term4047);
        setField(term4044, term4044.getClass(), "optionGroups", term4049);
        ArrayList term4059 = new ArrayList();
        ((ArrayList) term4059).add("flxyYxBRtu");
        ((ArrayList) term4059).add("OclPbYPkcH");
        ((ArrayList) term4059).add("IoAlmYsBwc");
        ((ArrayList) term4059).add("TEParAifyi");
        term4050 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4050, term4050.getClass(), "opt", "xOEqzGAmDU");
        setField(term4050, term4050.getClass(), "longOpt", "eZFUvlxvGV");
        setField(term4050, term4050.getClass(), "argName", "BYqFIqCKAV");
        setField(term4050, term4050.getClass(), "description", "vrQLuWIDJX");
        setBooleanField(term4050, term4050.getClass(), "required", true);
        setBooleanField(term4050, term4050.getClass(), "optionalArg", true);
        setIntField(term4050, term4050.getClass(), "numberOfArgs", 1162663216);
        setField(term4050, term4050.getClass(), "type", null);
        setField(term4050, term4050.getClass(), "values", term4059);
        setCharField(term4050, term4050.getClass(), "valuesep", 'A');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term835;
        Object retValue = callMethod(klass, "getOptionGroup", argTypes, term813, args);
        assertTrue(recursiveEquals(term813, term4044));
        assertTrue(recursiveEquals(term835, term4050));
        assertTrue(recursiveEquals(retValue, null));
    }

};


