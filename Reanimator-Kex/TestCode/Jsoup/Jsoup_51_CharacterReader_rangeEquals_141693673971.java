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
import java.lang.Integer;

public class CharacterReader_rangeEquals_141693673971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4219;
     Object term4242;
     Object term4244;
     Object term15728;

    public CharacterReader_rangeEquals_141693673971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4219 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4220 = (char[]) newCharArray(5);
        Object[] term4229 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term4220, 0, 'n');
        setCharElement(term4220, 1, 'z');
        setCharElement(term4220, 2, 'T');
        setCharElement(term4220, 3, 's');
        setCharElement(term4220, 4, 't');
        setField(term4219, term4219.getClass(), "input", term4220);
        setIntField(term4219, term4219.getClass(), "length", -268815336);
        setIntField(term4219, term4219.getClass(), "pos", -1210583429);
        setIntField(term4219, term4219.getClass(), "mark", -663691365);
        setElement(term4229, 0, "XYtryyobou");
        setField(term4219, term4219.getClass(), "stringCache", term4229);
        term4242 = new Integer(339854490);
        term4244 = new Integer(-615654495);
        term15728 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term15729 = (char[]) newCharArray(5);
        Object[] term15730 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term15729, 0, 'n');
        setCharElement(term15729, 1, 'z');
        setCharElement(term15729, 2, 'T');
        setCharElement(term15729, 3, 's');
        setCharElement(term15729, 4, 't');
        setField(term15728, term15728.getClass(), "input", term15729);
        setIntField(term15728, term15728.getClass(), "length", -268815336);
        setIntField(term15728, term15728.getClass(), "pos", -1210583429);
        setIntField(term15728, term15728.getClass(), "mark", -663691365);
        setElement(term15730, 0, "XYtryyobou");
        setField(term15728, term15728.getClass(), "stringCache", term15730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term4242;
        args[1] = term4244;
        args[2] = "OYbzXylRWW";
        Object retValue = callMethod(klass, "rangeEquals", argTypes, term4219, args);
        assertTrue(recursiveEquals(term4219, term15728));
        assertTrue(recursiveEquals(term4242, 339854490));
        assertTrue(recursiveEquals(term4244, -615654495));
        assertTrue(recursiveEquals(retValue, false));
    }

};


