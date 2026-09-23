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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;

public class CharacterReader_consumeToAnySorted_169045302151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1370;
     Object term1450;
     Object term7865;
     Object term7880;

    public CharacterReader_consumeToAnySorted_169045302151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1370 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1371 = (char[]) newCharArray(2);
        Object[] term1377 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term1371, 0, 'M');
        setCharElement(term1371, 1, 'j');
        setField(term1370, term1370.getClass(), "input", term1371);
        setIntField(term1370, term1370.getClass(), "length", -602026508);
        setIntField(term1370, term1370.getClass(), "pos", -157887805);
        setIntField(term1370, term1370.getClass(), "mark", 1876565163);
        setElement(term1377, 0, "UoYtihxVaS");
        setElement(term1377, 1, "JDswTTCZHV");
        setElement(term1377, 2, "onpbIeEKoi");
        setElement(term1377, 3, "YRHGsAkhxb");
        setElement(term1377, 4, "ffYhPOzlUs");
        setElement(term1377, 5, "MLqYREekMl");
        setField(term1370, term1370.getClass(), "stringCache", term1377);
        term1450 = (char[]) newCharArray(6);
        setCharElement(term1450, 0, 'G');
        setCharElement(term1450, 1, 'Y');
        setCharElement(term1450, 2, 'S');
        setCharElement(term1450, 3, 'R');
        setCharElement(term1450, 4, 'K');
        setCharElement(term1450, 5, 'T');
        term7865 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term7866 = (char[]) newCharArray(2);
        Object[] term7867 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term7866, 0, 'M');
        setCharElement(term7866, 1, 'j');
        setField(term7865, term7865.getClass(), "input", term7866);
        setIntField(term7865, term7865.getClass(), "length", -602026508);
        setIntField(term7865, term7865.getClass(), "pos", -157887805);
        setIntField(term7865, term7865.getClass(), "mark", 1876565163);
        setElement(term7867, 0, "UoYtihxVaS");
        setElement(term7867, 1, "JDswTTCZHV");
        setElement(term7867, 2, "onpbIeEKoi");
        setElement(term7867, 3, "YRHGsAkhxb");
        setElement(term7867, 4, "ffYhPOzlUs");
        setElement(term7867, 5, "MLqYREekMl");
        setField(term7865, term7865.getClass(), "stringCache", term7867);
        term7880 = (char[]) newCharArray(6);
        setCharElement(term7880, 0, 'G');
        setCharElement(term7880, 1, 'Y');
        setCharElement(term7880, 2, 'S');
        setCharElement(term7880, 3, 'R');
        setCharElement(term7880, 4, 'K');
        setCharElement(term7880, 5, 'T');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1450;
        Object retValue = callMethod(klass, "consumeToAnySorted", argTypes, term1370, args);
        assertTrue(recursiveEquals(term1370, term7865));
        assertTrue(recursiveEquals(term1450, term7880));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


