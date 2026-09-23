package org.jsoup.parser;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_current_205740416339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;

    public CharacterReader_current_205740416339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term228 = (char[]) newCharArray(1);
        Object[] term233 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term228, 0, 'T');
        setField(term227, term227.getClass(), "input", term228);
        setIntField(term227, term227.getClass(), "length", -1955890973);
        setIntField(term227, term227.getClass(), "pos", -2038273078);
        setIntField(term227, term227.getClass(), "mark", 1227103734);
        setElement(term233, 0, "RMFIsYGgne");
        setElement(term233, 1, "NRdvgJlhkX");
        setElement(term233, 2, "uuaPigETmJ");
        setElement(term233, 3, "MxlszYVzRf");
        setElement(term233, 4, "LQFpaHEwXR");
        setElement(term233, 5, "oVcInYnLWB");
        setField(term227, term227.getClass(), "stringCache", term233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "current", argTypes, term227, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


