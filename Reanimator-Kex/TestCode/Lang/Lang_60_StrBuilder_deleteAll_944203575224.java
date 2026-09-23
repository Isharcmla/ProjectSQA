package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;
import java.lang.Character;

public class StrBuilder_deleteAll_944203575224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6804;
     Object term6863;
     Object term69722;
     Object term69662;

    public StrBuilder_deleteAll_944203575224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6804 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term6805 = (char[]) newCharArray(32);
        setField(term6804, term6804.getClass(), "buffer", term6805);
        setIntField(term6804, term6804.getClass(), "size", -1210583429);
        setField(term6804, term6804.getClass(), "newLine", "JDaAnsVTGV");
        setField(term6804, term6804.getClass(), "nullText", "mLUZFTfjle");
        term6863 = new Character('t');
        term69722 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term69723 = (char[]) newCharArray(32);
        setField(term69722, term69722.getClass(), "buffer", term69723);
        setIntField(term69722, term69722.getClass(), "size", -1210583429);
        setField(term69722, term69722.getClass(), "newLine", "JDaAnsVTGV");
        setField(term69722, term69722.getClass(), "nullText", "mLUZFTfjle");
        term69662 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term69663 = (char[]) newCharArray(32);
        setField(term69662, term69662.getClass(), "buffer", term69663);
        setIntField(term69662, term69662.getClass(), "size", -1210583429);
        setField(term69662, term69662.getClass(), "newLine", "JDaAnsVTGV");
        setField(term69662, term69662.getClass(), "nullText", "mLUZFTfjle");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term6863;
        Object retValue = callMethod(klass, "deleteAll", argTypes, term6804, args);
        assertTrue(recursiveEquals(term6804, term69722));
        assertTrue(recursiveEquals(term6863, 't'));
        assertTrue(recursiveEquals(retValue, term69662));
    }

};


