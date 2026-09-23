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

public class CharacterReader_cacheString_1100983166443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2381907;

    public CharacterReader_cacheString_1100983166443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2381907 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2381797 = (char[]) newCharArray(9);
        Object[] term2381807 = (Object[]) newArray("java.lang.String", 0);
        setCharElement(term2381797, 0, (char) 49153);
        setCharElement(term2381797, 1, (char) 49153);
        setCharElement(term2381797, 2, (char) 49153);
        setCharElement(term2381797, 3, (char) 49153);
        setCharElement(term2381797, 4, (char) 49153);
        setCharElement(term2381797, 5, (char) 49153);
        setCharElement(term2381797, 6, (char) 49153);
        setCharElement(term2381797, 7, (char) 49153);
        setCharElement(term2381797, 8, (char) 49153);
        setField(term2381907, term2381907.getClass(), "input", term2381797);
        setField(term2381907, term2381907.getClass(), "stringCache", term2381807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 1;
        try {
            callMethod(klass, "cacheString", argTypes, term2381907, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


