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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;

public class DefaultParser_handleLongOptionWithEqual_136347419341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3265;

    public DefaultParser_handleLongOptionWithEqual_136347419341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term3267 = new LinkedList();
        ArrayList term3270 = new ArrayList();
        HashMap term3275 = new HashMap();
        HashMap term3280 = new HashMap();
        ArrayList term3285 = new ArrayList();
        HashMap term3289 = new HashMap();
        ArrayList term3360 = new ArrayList();
        ArrayList term3366 = new ArrayList();
        term3265 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term3266 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term3274 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term3307 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3359 = newInstance(Class.forName("java.lang.Object"));
        setField(term3266, term3266.getClass(), "args", term3267);
        setField(term3266, term3266.getClass(), "options", term3270);
        setField(term3265, term3265.getClass(), "cmd", term3266);
        setField(term3274, term3274.getClass(), "shortOpts", term3275);
        setField(term3274, term3274.getClass(), "longOpts", term3280);
        setField(term3274, term3274.getClass(), "requiredOpts", term3285);
        setField(term3274, term3274.getClass(), "optionGroups", term3289);
        setField(term3265, term3265.getClass(), "options", term3274);
        setBooleanField(term3265, term3265.getClass(), "stopAtNonOption", true);
        setField(term3265, term3265.getClass(), "currentToken", "sEnIVFtZuQ");
        setField(term3307, term3307.getClass(), "opt", "ZVecLZMLHF");
        setField(term3307, term3307.getClass(), "longOpt", "fztQhjqwdP");
        setField(term3307, term3307.getClass(), "argName", "eVpkWxjuki");
        setField(term3307, term3307.getClass(), "description", "SJiQaLvSKv");
        setBooleanField(term3307, term3307.getClass(), "required", true);
        setBooleanField(term3307, term3307.getClass(), "optionalArg", true);
        setIntField(term3307, term3307.getClass(), "numberOfArgs", -1685132342);
        setField(term3307, term3307.getClass(), "type", term3359);
        setField(term3307, term3307.getClass(), "values", term3360);
        setCharField(term3307, term3307.getClass(), "valuesep", 't');
        setField(term3265, term3265.getClass(), "currentOption", term3307);
        setBooleanField(term3265, term3265.getClass(), "skipParsing", false);
        setField(term3265, term3265.getClass(), "expectedOpts", term3366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OEXDRUKcFl";
        try {
            callMethod(klass, "handleLongOptionWithEqual", argTypes, term3265, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


