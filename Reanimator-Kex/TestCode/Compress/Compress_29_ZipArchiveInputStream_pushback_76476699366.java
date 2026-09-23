package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ZipArchiveInputStream_pushback_76476699366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38434;
     Object term38441;
     Object term38443;

    public ZipArchiveInputStream_pushback_76476699366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38434 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term38434, term38434.getClass(), "zipEncoding", null);
        setBooleanField(term38434, term38434.getClass(), "useUnicodeExtraFields", false);
        setField(term38434, term38434.getClass(), "in", null);
        setField(term38434, term38434.getClass(), "inf", null);
        setField(term38434, term38434.getClass(), "buf", null);
        setField(term38434, term38434.getClass(), "current", null);
        setBooleanField(term38434, term38434.getClass(), "closed", false);
        setBooleanField(term38434, term38434.getClass(), "hitCentralDirectory", false);
        setField(term38434, term38434.getClass(), "lastStoredEntry", null);
        setBooleanField(term38434, term38434.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term38434, term38434.getClass(), "LFH_BUF", null);
        setField(term38434, term38434.getClass(), "SKIP_BUF", null);
        setField(term38434, term38434.getClass(), "SHORT_BUF", null);
        setField(term38434, term38434.getClass(), "WORD_BUF", null);
        setField(term38434, term38434.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term38434, term38434.getClass(), "entriesRead", 0);
        setField(term38434, term38434.getClass(), "SINGLE", null);
        setLongField(term38434, term38434.getClass(), "bytesRead", 0L);
        term38441 = new Integer(0);
        term38443 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term38441;
        args[2] = term38443;
        callMethod(klass, "pushback", argTypes, term38434, args);
    }

};


