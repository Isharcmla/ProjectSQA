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

public class Option_clone_3724270683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3816;
     Object term11505;
     Object term11391;

    public Option_clone_3724270683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3868 = new ArrayList();
        term3816 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3816, term3816.getClass(), "opt", "HWkpTmtlrc");
        setField(term3816, term3816.getClass(), "longOpt", "hMmaoREuCK");
        setField(term3816, term3816.getClass(), "argName", "VeDtgDzGAN");
        setField(term3816, term3816.getClass(), "description", "aWYOWZFyaX");
        setBooleanField(term3816, term3816.getClass(), "required", true);
        setBooleanField(term3816, term3816.getClass(), "optionalArg", false);
        setIntField(term3816, term3816.getClass(), "numberOfArgs", -1145578966);
        setField(term3816, term3816.getClass(), "type", null);
        setField(term3816, term3816.getClass(), "values", term3868);
        setCharField(term3816, term3816.getClass(), "valuesep", 'Y');
        ArrayList term11514 = new ArrayList();
        term11505 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term11505, term11505.getClass(), "opt", "HWkpTmtlrc");
        setField(term11505, term11505.getClass(), "longOpt", "hMmaoREuCK");
        setField(term11505, term11505.getClass(), "argName", "VeDtgDzGAN");
        setField(term11505, term11505.getClass(), "description", "aWYOWZFyaX");
        setBooleanField(term11505, term11505.getClass(), "required", true);
        setBooleanField(term11505, term11505.getClass(), "optionalArg", false);
        setIntField(term11505, term11505.getClass(), "numberOfArgs", -1145578966);
        setField(term11505, term11505.getClass(), "type", null);
        setField(term11505, term11505.getClass(), "values", term11514);
        setCharField(term11505, term11505.getClass(), "valuesep", 'Y');
        ArrayList term11443 = new ArrayList();
        term11391 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term11391, term11391.getClass(), "opt", "HWkpTmtlrc");
        setField(term11391, term11391.getClass(), "longOpt", "hMmaoREuCK");
        setField(term11391, term11391.getClass(), "argName", "VeDtgDzGAN");
        setField(term11391, term11391.getClass(), "description", "aWYOWZFyaX");
        setBooleanField(term11391, term11391.getClass(), "required", true);
        setBooleanField(term11391, term11391.getClass(), "optionalArg", false);
        setIntField(term11391, term11391.getClass(), "numberOfArgs", -1145578966);
        setField(term11391, term11391.getClass(), "type", null);
        setField(term11391, term11391.getClass(), "values", term11443);
        setCharField(term11391, term11391.getClass(), "valuesep", 'Y');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term3816, args);
        assertTrue(recursiveEquals(term3816, term11505));
        assertTrue(recursiveEquals(retValue, term11391));
    }

};


