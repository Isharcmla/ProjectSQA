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

public class CharacterReader_consumeTo_1694855709327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90863;

    public CharacterReader_consumeTo_1694855709327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90863 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term90513 = (char[]) newCharArray(236);
        setIntField(term90863, term90863.getClass(), "bufPos", 2147483645);
        setIntField(term90863, term90863.getClass(), "bufSplitPoint", 2147483646);
        setIntField(term90863, term90863.getClass(), "bufLength", -2147483646);
        setCharElement(term90513, 106, (char) 1);
        setCharElement(term90513, 107, (char) 1);
        setCharElement(term90513, 108, (char) 1);
        setCharElement(term90513, 109, (char) 1);
        setCharElement(term90513, 110, (char) 1);
        setCharElement(term90513, 111, (char) 1);
        setCharElement(term90513, 112, (char) 1);
        setCharElement(term90513, 113, (char) 1);
        setCharElement(term90513, 114, (char) 1);
        setCharElement(term90513, 115, (char) 1);
        setCharElement(term90513, 116, (char) 1);
        setCharElement(term90513, 117, (char) 1);
        setCharElement(term90513, 118, (char) 1);
        setCharElement(term90513, 119, (char) 1);
        setCharElement(term90513, 120, (char) 1);
        setCharElement(term90513, 121, (char) 1);
        setCharElement(term90513, 122, (char) 1);
        setCharElement(term90513, 123, (char) 1);
        setCharElement(term90513, 124, (char) 1);
        setCharElement(term90513, 125, (char) 1);
        setCharElement(term90513, 126, (char) 1);
        setCharElement(term90513, 127, (char) 1);
        setCharElement(term90513, 128, (char) 1);
        setCharElement(term90513, 129, (char) 1);
        setCharElement(term90513, 130, (char) 1);
        setCharElement(term90513, 131, (char) 1);
        setCharElement(term90513, 132, (char) 1);
        setCharElement(term90513, 133, (char) 1);
        setCharElement(term90513, 134, (char) 1);
        setCharElement(term90513, 135, (char) 1);
        setCharElement(term90513, 136, (char) 1);
        setCharElement(term90513, 137, (char) 1);
        setCharElement(term90513, 138, (char) 1);
        setCharElement(term90513, 139, (char) 1);
        setCharElement(term90513, 140, (char) 1);
        setCharElement(term90513, 141, (char) 1);
        setCharElement(term90513, 142, (char) 1);
        setCharElement(term90513, 143, (char) 1);
        setCharElement(term90513, 144, (char) 1);
        setCharElement(term90513, 145, (char) 1);
        setCharElement(term90513, 146, (char) 1);
        setCharElement(term90513, 147, (char) 1);
        setCharElement(term90513, 148, (char) 1);
        setCharElement(term90513, 149, (char) 1);
        setCharElement(term90513, 150, (char) 1);
        setCharElement(term90513, 151, (char) 1);
        setCharElement(term90513, 152, (char) 1);
        setCharElement(term90513, 153, (char) 1);
        setCharElement(term90513, 154, (char) 1);
        setCharElement(term90513, 155, (char) 1);
        setCharElement(term90513, 156, (char) 1);
        setCharElement(term90513, 157, (char) 1);
        setCharElement(term90513, 158, (char) 1);
        setCharElement(term90513, 159, (char) 1);
        setCharElement(term90513, 160, (char) 1);
        setCharElement(term90513, 161, (char) 1);
        setCharElement(term90513, 162, (char) 1);
        setCharElement(term90513, 163, (char) 1);
        setCharElement(term90513, 164, (char) 1);
        setCharElement(term90513, 165, (char) 1);
        setCharElement(term90513, 166, (char) 1);
        setCharElement(term90513, 167, (char) 1);
        setCharElement(term90513, 168, (char) 1);
        setCharElement(term90513, 169, (char) 1);
        setCharElement(term90513, 170, (char) 1);
        setCharElement(term90513, 171, (char) 1);
        setCharElement(term90513, 172, (char) 1);
        setCharElement(term90513, 173, (char) 1);
        setCharElement(term90513, 174, (char) 1);
        setCharElement(term90513, 175, (char) 1);
        setCharElement(term90513, 176, (char) 1);
        setCharElement(term90513, 177, (char) 1);
        setCharElement(term90513, 178, (char) 1);
        setCharElement(term90513, 179, (char) 1);
        setCharElement(term90513, 180, (char) 1);
        setCharElement(term90513, 181, (char) 1);
        setCharElement(term90513, 182, (char) 1);
        setCharElement(term90513, 183, (char) 1);
        setCharElement(term90513, 184, (char) 1);
        setCharElement(term90513, 185, (char) 1);
        setCharElement(term90513, 186, (char) 1);
        setCharElement(term90513, 187, (char) 1);
        setCharElement(term90513, 188, (char) 1);
        setCharElement(term90513, 189, (char) 1);
        setCharElement(term90513, 190, (char) 1);
        setCharElement(term90513, 191, (char) 1);
        setCharElement(term90513, 192, (char) 1);
        setCharElement(term90513, 193, (char) 1);
        setCharElement(term90513, 194, (char) 1);
        setCharElement(term90513, 195, (char) 1);
        setCharElement(term90513, 196, (char) 1);
        setCharElement(term90513, 197, (char) 1);
        setCharElement(term90513, 198, (char) 1);
        setCharElement(term90513, 199, (char) 1);
        setCharElement(term90513, 200, (char) 1);
        setCharElement(term90513, 201, (char) 1);
        setCharElement(term90513, 202, (char) 1);
        setCharElement(term90513, 203, (char) 1);
        setCharElement(term90513, 204, (char) 1);
        setCharElement(term90513, 205, (char) 1);
        setCharElement(term90513, 206, (char) 1);
        setCharElement(term90513, 207, (char) 1);
        setCharElement(term90513, 208, (char) 1);
        setCharElement(term90513, 209, (char) 1);
        setCharElement(term90513, 210, (char) 1);
        setCharElement(term90513, 211, (char) 1);
        setCharElement(term90513, 212, (char) 1);
        setCharElement(term90513, 213, (char) 1);
        setCharElement(term90513, 214, (char) 1);
        setCharElement(term90513, 215, (char) 1);
        setCharElement(term90513, 216, (char) 1);
        setCharElement(term90513, 217, (char) 1);
        setCharElement(term90513, 218, (char) 1);
        setCharElement(term90513, 219, (char) 1);
        setCharElement(term90513, 220, (char) 1);
        setCharElement(term90513, 221, (char) 1);
        setCharElement(term90513, 222, (char) 1);
        setCharElement(term90513, 223, (char) 1);
        setCharElement(term90513, 224, (char) 1);
        setCharElement(term90513, 225, (char) 1);
        setCharElement(term90513, 226, (char) 1);
        setCharElement(term90513, 227, (char) 1);
        setCharElement(term90513, 228, (char) 1);
        setCharElement(term90513, 229, (char) 1);
        setCharElement(term90513, 230, (char) 1);
        setCharElement(term90513, 231, (char) 1);
        setCharElement(term90513, 232, (char) 1);
        setCharElement(term90513, 233, (char) 1);
        setCharElement(term90513, 234, (char) 1);
        setCharElement(term90513, 235, (char) 1);
        setField(term90863, term90863.getClass(), "charBuf", term90513);
        setField(term90863, term90863.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        try {
            callMethod(klass, "consumeTo", argTypes, term90863, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


