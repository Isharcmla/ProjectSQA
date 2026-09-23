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

public class Option_setType_61197778051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547;
     Object term5608;

    public Option_setType_61197778051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term599 = new ArrayList();
        term547 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term547, term547.getClass(), "opt", "eZFUvlxvGV");
        setField(term547, term547.getClass(), "longOpt", "BYqFIqCKAV");
        setField(term547, term547.getClass(), "argName", "vrQLuWIDJX");
        setField(term547, term547.getClass(), "description", "flxyYxBRtu");
        setBooleanField(term547, term547.getClass(), "required", false);
        setBooleanField(term547, term547.getClass(), "optionalArg", true);
        setIntField(term547, term547.getClass(), "numberOfArgs", -1922583790);
        setField(term547, term547.getClass(), "type", null);
        setField(term547, term547.getClass(), "values", term599);
        setCharField(term547, term547.getClass(), "valuesep", 't');
        ArrayList term5617 = new ArrayList();
        term5608 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term5608, term5608.getClass(), "opt", "eZFUvlxvGV");
        setField(term5608, term5608.getClass(), "longOpt", "BYqFIqCKAV");
        setField(term5608, term5608.getClass(), "argName", "vrQLuWIDJX");
        setField(term5608, term5608.getClass(), "description", "flxyYxBRtu");
        setBooleanField(term5608, term5608.getClass(), "required", false);
        setBooleanField(term5608, term5608.getClass(), "optionalArg", true);
        setIntField(term5608, term5608.getClass(), "numberOfArgs", -1922583790);
        setField(term5608, term5608.getClass(), "type", null);
        setField(term5608, term5608.getClass(), "values", term5617);
        setCharField(term5608, term5608.getClass(), "valuesep", 't');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setType", argTypes, term547, args);
        assertTrue(recursiveEquals(term547, term5608));
    }

};


