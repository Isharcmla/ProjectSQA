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

public class CharacterReader_matchesLetter_85209721969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3213;

    public CharacterReader_matchesLetter_85209721969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3213 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3214 = (char[]) newCharArray(9);
        Object[] term3229 = (Object[]) newArray("java.lang.String", 7);
        setCharElement(term3214, 0, 'Q');
        setCharElement(term3214, 1, 'F');
        setCharElement(term3214, 2, 'p');
        setCharElement(term3214, 3, 'a');
        setCharElement(term3214, 4, 'H');
        setCharElement(term3214, 5, 'E');
        setCharElement(term3214, 6, 'w');
        setCharElement(term3214, 7, 'X');
        setCharElement(term3214, 8, 'R');
        setField(term3213, term3213.getClass(), "charBuf", term3214);
        setField(term3213, term3213.getClass(), "reader", null);
        setIntField(term3213, term3213.getClass(), "bufLength", 71190297);
        setIntField(term3213, term3213.getClass(), "bufSplitPoint", 1202361360);
        setIntField(term3213, term3213.getClass(), "bufPos", -2015048153);
        setIntField(term3213, term3213.getClass(), "readerPos", -2063457669);
        setIntField(term3213, term3213.getClass(), "bufMark", -1222006000);
        setElement(term3229, 0, "AdxvLJhNLe");
        setElement(term3229, 1, "lHfTrWKMPk");
        setElement(term3229, 2, "JDaAnsVTGV");
        setElement(term3229, 3, "mLUZFTfjle");
        setElement(term3229, 4, "xIeFjkHkOe");
        setElement(term3229, 5, "SdCKLMIYnX");
        setElement(term3229, 6, "OJJtVNPyKZ");
        setField(term3213, term3213.getClass(), "stringCache", term3229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "matchesLetter", argTypes, term3213, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


