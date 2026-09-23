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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class CharacterReader_cacheString_135964067575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4145;
     Object term4146;
     Object term4219;
     Object term4221;

    public CharacterReader_cacheString_135964067575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4145 = (char[]) newCharArray(0);
        term4146 = (Object[]) newArray("java.lang.String", 6);
        setElement(term4146, 0, "aWYOWZFyaX");
        setElement(term4146, 1, "BRIVNtfUWU");
        setElement(term4146, 2, "DbiCVtPPCT");
        setElement(term4146, 3, "WzFopsaDuG");
        setElement(term4146, 4, "PapWxkhEWe");
        setElement(term4146, 5, "smnHEqRFRx");
        term4219 = new Integer(1384592638);
        term4221 = new Integer(-1002370457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term4145;
        args[1] = term4146;
        args[2] = term4219;
        args[3] = term4221;
        try {
            callMethod(klass, "cacheString", argTypes, null, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


