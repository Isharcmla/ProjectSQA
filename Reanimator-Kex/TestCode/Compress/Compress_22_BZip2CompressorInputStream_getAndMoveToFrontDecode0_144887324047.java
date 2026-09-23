package org.apache.commons.compress.compressors.bzip2;

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
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class BZip2CompressorInputStream_getAndMoveToFrontDecode0_144887324047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5747;
     Object term5907;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode0_144887324047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5747 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term5754 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        Object term5773 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term5774 = (boolean[]) newBooleanArray(9);
        byte[] term5784 = (byte[]) newByteArray(8);
        byte[] term5793 = (byte[]) newByteArray(9);
        byte[] term5803 = (byte[]) newByteArray(0);
        int[] term5804 = (int[]) newIntArray(8);
        Object[] term5813 = (Object[]) newArray("[I", 9);
        int[] term5814 = (int[]) newIntArray(0);
        int[] term5815 = (int[]) newIntArray(2);
        int[] term5818 = (int[]) newIntArray(0);
        int[] term5819 = (int[]) newIntArray(4);
        int[] term5824 = (int[]) newIntArray(4);
        int[] term5829 = (int[]) newIntArray(8);
        int[] term5838 = (int[]) newIntArray(4);
        int[] term5843 = (int[]) newIntArray(1);
        int[] term5845 = (int[]) newIntArray(9);
        Object[] term5855 = (Object[]) newArray("[I", 2);
        int[] term5856 = (int[]) newIntArray(1);
        int[] term5858 = (int[]) newIntArray(2);
        Object[] term5861 = (Object[]) newArray("[I", 1);
        int[] term5862 = (int[]) newIntArray(4);
        int[] term5867 = (int[]) newIntArray(1);
        int[] term5869 = (int[]) newIntArray(4);
        char[] term5874 = (char[]) newCharArray(0);
        Object[] term5875 = (Object[]) newArray("[C", 3);
        char[] term5876 = (char[]) newCharArray(6);
        char[] term5883 = (char[]) newCharArray(4);
        char[] term5888 = (char[]) newCharArray(3);
        byte[] term5892 = (byte[]) newByteArray(6);
        int[] term5899 = (int[]) newIntArray(4);
        byte[] term5904 = (byte[]) newByteArray(1);
        setIntField(term5747, term5747.getClass(), "last", -1365904757);
        setIntField(term5747, term5747.getClass(), "origPtr", -1487263349);
        setIntField(term5747, term5747.getClass(), "blockSize100k", -1009732764);
        setBooleanField(term5747, term5747.getClass(), "blockRandomised", false);
        setIntField(term5747, term5747.getClass(), "bsBuff", 950783153);
        setIntField(term5747, term5747.getClass(), "bsLive", -801175078);
        setIntField(term5754, term5754.getClass(), "globalCrc", -1);
        setField(term5747, term5747.getClass(), "crc", term5754);
        setIntField(term5747, term5747.getClass(), "nInUse", 2085098404);
        setField(term5747, term5747.getClass(), "in", null);
        setBooleanField(term5747, term5747.getClass(), "decompressConcatenated", true);
        setIntField(term5747, term5747.getClass(), "currentChar", -684064427);
        setIntField(term5747, term5747.getClass(), "currentState", -176676344);
        setIntField(term5747, term5747.getClass(), "storedBlockCRC", 1949009312);
        setIntField(term5747, term5747.getClass(), "storedCombinedCRC", -432054743);
        setIntField(term5747, term5747.getClass(), "computedBlockCRC", -859726380);
        setIntField(term5747, term5747.getClass(), "computedCombinedCRC", -1498422654);
        setIntField(term5747, term5747.getClass(), "su_count", -1499829233);
        setIntField(term5747, term5747.getClass(), "su_ch2", -888855662);
        setIntField(term5747, term5747.getClass(), "su_chPrev", -1483966656);
        setIntField(term5747, term5747.getClass(), "su_i2", -334260786);
        setIntField(term5747, term5747.getClass(), "su_j2", -765890956);
        setIntField(term5747, term5747.getClass(), "su_rNToGo", -214452542);
        setIntField(term5747, term5747.getClass(), "su_rTPos", -21429773);
        setIntField(term5747, term5747.getClass(), "su_tPos", 1774728742);
        setCharField(term5747, term5747.getClass(), "su_z", 's');
        setBooleanElement(term5774, 0, true);
        setField(term5773, term5773.getClass(), "inUse", term5774);
        setByteElement(term5784, 0, (byte) 87);
        setByteElement(term5784, 1, (byte) 97);
        setByteElement(term5784, 2, (byte) 51);
        setByteElement(term5784, 3, (byte) 24);
        setByteElement(term5784, 4, (byte) -14);
        setByteElement(term5784, 5, (byte) 74);
        setByteElement(term5784, 6, (byte) 56);
        setByteElement(term5784, 7, (byte) -76);
        setField(term5773, term5773.getClass(), "seqToUnseq", term5784);
        setByteElement(term5793, 0, (byte) -29);
        setByteElement(term5793, 1, (byte) 121);
        setByteElement(term5793, 2, (byte) -17);
        setByteElement(term5793, 3, (byte) -123);
        setByteElement(term5793, 4, (byte) -76);
        setByteElement(term5793, 5, (byte) -46);
        setByteElement(term5793, 6, (byte) -82);
        setByteElement(term5793, 7, (byte) -105);
        setByteElement(term5793, 8, (byte) 35);
        setField(term5773, term5773.getClass(), "selector", term5793);
        setField(term5773, term5773.getClass(), "selectorMtf", term5803);
        setIntElement(term5804, 0, -1822211508);
        setIntElement(term5804, 1, -177243872);
        setIntElement(term5804, 2, 1485047282);
        setIntElement(term5804, 3, 1624190794);
        setIntElement(term5804, 4, -773608881);
        setIntElement(term5804, 5, -1642688455);
        setIntElement(term5804, 6, -1184558215);
        setIntElement(term5804, 7, 2123688338);
        setField(term5773, term5773.getClass(), "unzftab", term5804);
        setElement(term5813, 0, term5814);
        setIntElement(term5815, 0, -1051941387);
        setIntElement(term5815, 1, -640763660);
        setElement(term5813, 1, term5815);
        setElement(term5813, 2, term5818);
        setIntElement(term5819, 0, -1189468129);
        setIntElement(term5819, 1, -1099664830);
        setIntElement(term5819, 2, 873502011);
        setIntElement(term5819, 3, -2004575734);
        setElement(term5813, 3, term5819);
        setIntElement(term5824, 0, 1491468856);
        setIntElement(term5824, 1, 962385185);
        setIntElement(term5824, 2, 2146718886);
        setIntElement(term5824, 3, -985577036);
        setElement(term5813, 4, term5824);
        setIntElement(term5829, 0, 802539130);
        setIntElement(term5829, 1, 2105146188);
        setIntElement(term5829, 2, -862415480);
        setIntElement(term5829, 3, 312605349);
        setIntElement(term5829, 4, -402072606);
        setIntElement(term5829, 5, -477355193);
        setIntElement(term5829, 6, 168425089);
        setIntElement(term5829, 7, -571931590);
        setElement(term5813, 5, term5829);
        setIntElement(term5838, 0, 37757400);
        setIntElement(term5838, 1, -1632221612);
        setIntElement(term5838, 2, 1545314376);
        setIntElement(term5838, 3, 437959151);
        setElement(term5813, 6, term5838);
        setIntElement(term5843, 0, 27780241);
        setElement(term5813, 7, term5843);
        setIntElement(term5845, 0, -683868408);
        setIntElement(term5845, 1, -381130069);
        setIntElement(term5845, 2, 885769749);
        setIntElement(term5845, 3, -1021168716);
        setIntElement(term5845, 4, -1238055654);
        setIntElement(term5845, 5, 1561513428);
        setIntElement(term5845, 6, 778959809);
        setIntElement(term5845, 7, -7504064);
        setIntElement(term5845, 8, -1464364418);
        setElement(term5813, 8, term5845);
        setField(term5773, term5773.getClass(), "limit", term5813);
        setIntElement(term5856, 0, 1050420173);
        setElement(term5855, 0, term5856);
        setIntElement(term5858, 0, 994300935);
        setIntElement(term5858, 1, 433954476);
        setElement(term5855, 1, term5858);
        setField(term5773, term5773.getClass(), "base", term5855);
        setIntElement(term5862, 0, 1780958641);
        setIntElement(term5862, 1, 1890582085);
        setIntElement(term5862, 2, 2146568808);
        setIntElement(term5862, 3, 245081679);
        setElement(term5861, 0, term5862);
        setField(term5773, term5773.getClass(), "perm", term5861);
        setIntElement(term5867, 0, 1199789398);
        setField(term5773, term5773.getClass(), "minLens", term5867);
        setIntElement(term5869, 0, -1056402285);
        setIntElement(term5869, 1, 1881803912);
        setIntElement(term5869, 2, -188535038);
        setIntElement(term5869, 3, 254650626);
        setField(term5773, term5773.getClass(), "cftab", term5869);
        setField(term5773, term5773.getClass(), "getAndMoveToFrontDecode_yy", term5874);
        setCharElement(term5876, 0, 'O');
        setCharElement(term5876, 1, 'b');
        setCharElement(term5876, 2, 'l');
        setCharElement(term5876, 3, 'B');
        setCharElement(term5876, 4, 'n');
        setCharElement(term5876, 5, 'd');
        setElement(term5875, 0, term5876);
        setCharElement(term5883, 0, 's');
        setCharElement(term5883, 1, 'H');
        setCharElement(term5883, 2, 'w');
        setCharElement(term5883, 3, 'A');
        setElement(term5875, 1, term5883);
        setCharElement(term5888, 0, 'F');
        setCharElement(term5888, 1, 'M');
        setCharElement(term5888, 2, 'v');
        setElement(term5875, 2, term5888);
        setField(term5773, term5773.getClass(), "temp_charArray2d", term5875);
        setByteElement(term5892, 0, (byte) -80);
        setByteElement(term5892, 1, (byte) 96);
        setByteElement(term5892, 2, (byte) -66);
        setByteElement(term5892, 3, (byte) 109);
        setByteElement(term5892, 4, (byte) -44);
        setByteElement(term5892, 5, (byte) 100);
        setField(term5773, term5773.getClass(), "recvDecodingTables_pos", term5892);
        setIntElement(term5899, 0, -1789030917);
        setIntElement(term5899, 1, 912208163);
        setIntElement(term5899, 2, 909767683);
        setIntElement(term5899, 3, -639390893);
        setField(term5773, term5773.getClass(), "tt", term5899);
        setByteElement(term5904, 0, (byte) -90);
        setField(term5773, term5773.getClass(), "ll8", term5904);
        setField(term5747, term5747.getClass(), "data", term5773);
        setLongField(term5747, term5747.getClass(), "bytesRead", -316468845751588286L);
        term5907 = new Integer(1176415280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5907;
        try {
            callMethod(klass, "getAndMoveToFrontDecode0", argTypes, term5747, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


